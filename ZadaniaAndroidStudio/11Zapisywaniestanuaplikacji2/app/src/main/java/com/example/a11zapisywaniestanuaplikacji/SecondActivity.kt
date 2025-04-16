import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.a11zapisywaniestanuaplikacji.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val userName = intent.getStringExtra("user_name")

        val nameTextView: TextView = findViewById(R.id.nameTextView)


        nameTextView.text = "Witaj, $userName!"
    }
}
