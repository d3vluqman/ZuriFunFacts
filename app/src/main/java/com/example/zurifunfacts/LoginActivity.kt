package com.example.zurifunfacts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()
    }

    //    Function that enables one to sign in and view the fun facts
    private fun signIn() {
        val email: TextInputEditText = findViewById(R.id.et_email)
        val password: TextInputEditText = findViewById(R.id.et_password)
        val signInButton: MaterialButton = findViewById(R.id.btn_submit)

        signInButton.setOnClickListener() {
//            Checking if the email and password fields are filled or not
            if (email.text.toString().isEmpty() || password.text.toString().isEmpty()) {
                Toast.makeText(this, "Please fill in both fields", Toast.LENGTH_SHORT).show()
            } else {
//                If statement that restricts login to specific email and password
                if (email.text.toString() == "luqmanabdulwasii@gmail.com" && password.text.toString() == "1234pass") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Incorrect email or password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}