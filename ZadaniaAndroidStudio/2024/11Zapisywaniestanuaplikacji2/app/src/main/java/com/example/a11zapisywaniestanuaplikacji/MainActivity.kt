import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.SharedPreferences
import com.example.a11zapisywaniestanuaplikacji.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sharedPreferences: SharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
        val savedName = sharedPreferences.getString("user_name", null)


        if (savedName != null) {
            navigateToSecondActivity(savedName)
        }

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val saveButton: Button = findViewById(R.id.saveButton)

        saveButton.setOnClickListener {
            val name = nameEditText.text.toString()


            val editor = sharedPreferences.edit()
            editor.putString("user_name", name)
            editor.apply()


            navigateToSecondActivity(name)
        }
    }

    private fun navigateToSecondActivity(name: String) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user_name", name)
        startActivity(intent)
        finish()
    }
}
