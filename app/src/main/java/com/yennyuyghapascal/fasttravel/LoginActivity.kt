package com.yennyuyghapascal.fasttravel

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter your username and password", Toast.LENGTH_SHORT).show()
            } else if (username != "your_username" || password != "your_password") {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            } else {
                // Login successful, navigate to next screen
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // TODO: Navigate to next screen
            }
        }
    }
}
