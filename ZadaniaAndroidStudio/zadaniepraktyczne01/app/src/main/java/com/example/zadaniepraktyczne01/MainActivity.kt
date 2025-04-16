import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)


        val emailEditText: EditText = findViewById(id.emailEditText)
        val passwordEditText: EditText = findViewById(id.passwordEditText)
        val repeatPasswordEditText: EditText = findViewById(id.repeatPasswordEditText)
        val submitButton: Button = findViewById(id.submitButton)
        val messageTextView: TextView = findViewById(id.messageTextView)


        messageTextView.text = "Autor: 12345678901"

        submitButton.setOnClickListener {

            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val repeatPassword = repeatPasswordEditText.text.toString()


            if (!email.contains("@")) {
                messageTextView.text = "Nieprawidłowy adres e-mail"
            } else if (password != repeatPassword) {
                messageTextView.text = "Hasła się różnią"
            } else {
                messageTextView.text = "Witaj $email"
            }
        }
    }
}
