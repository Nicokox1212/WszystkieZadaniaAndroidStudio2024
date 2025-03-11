package com.example.a18czujniki

import android.app.Activity
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.LayoutInflaterCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), SensorEventListener {

    lateinit var binding: ActivityMainBinding
    lateinit var sensorManager: SensorManager
    lateinit var sensor: Sensor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding ActivityMainBinding.inflate(LayoutInflaterCompat.from(this))

        setContentView(binding.root)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager


        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    }

    override fun onResume() {
        super.onResume()
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_FASTEST)
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event == null){
            return
        }

        binding.direction.text = "Prosto"

        if (event.values[0]<0.5){
            binding.direction.text = "Prawo"
        }

        if (event.values[0]>0.5){
            binding.direction.text = "Lewo"
        }

        binding.sensorsValues.text = "${event.values[0]} \n${event.values[1]} \n ${event.values[2]}"

    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
       // TODO("Not yet implemented")
    }
}
