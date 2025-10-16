package com.example.zadaniergbseekbar

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.SeekBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.red
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zadaniergbseekbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var red = 255
    private var green = 255
    private var blue = 255

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        with(binding){
            seekRed.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    red = p1
                    val color = Color.rgb(red, green, blue)
                    colorPreview.setBackgroundColor(color)
                    textViewRed.setBackgroundColor(Color.rgb(red,0,0))
                    textViewGreen.setBackgroundColor(Color.rgb(0,green,0))
                    textViewBlue.setBackgroundColor(Color.rgb(0,0,blue))
                }






                override fun onStartTrackingTouch(p0: SeekBar?) {}
                override fun onStopTrackingTouch(p0: SeekBar?) {}

            })


            seekBlue.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    blue = p1
                    val color = Color.rgb(red, green, blue)
                    colorPreview.setBackgroundColor(color)
                    textViewRed.setBackgroundColor(Color.rgb(red,0,0))
                    textViewGreen.setBackgroundColor(Color.rgb(0,green,0))
                    textViewBlue.setBackgroundColor(Color.rgb(0,0,blue))
                }






                override fun onStartTrackingTouch(p0: SeekBar?) {}
                override fun onStopTrackingTouch(p0: SeekBar?) {}

            })

                seekGreen.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                        green = p1
                        val color = Color.rgb(red, green, blue)
                        colorPreview.setBackgroundColor(color)
                        textViewRed.setBackgroundColor(Color.rgb(red,0,0))
                        textViewGreen.setBackgroundColor(Color.rgb(0,green,0))
                        textViewBlue.setBackgroundColor(Color.rgb(0,0,blue))
                    }






                    override fun onStartTrackingTouch(p0: SeekBar?) {}
                    override fun onStopTrackingTouch(p0: SeekBar?) {}

                })
        }
    }

}