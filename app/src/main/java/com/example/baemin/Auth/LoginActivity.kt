package com.example.baemin.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.baemin.MainActivity
import com.example.baemin.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        //Login
        login_button.setOnClickListener {
            auth.signInWithEmailAndPassword(emaill_area.text.toString(), password_area.text.toString())
                .addOnCompleteListener(this) {task ->
                    if (task.isSuccessful) {
                        // Sign in success, Update UI with the signed-in user's information
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        // login fail
                        Toast.makeText(this, "회원가입을 진행해주세요", Toast.LENGTH_SHORT).show()
                    }
                }
        }
        join_button.setOnClickListener {
            val intent = Intent(this,JoinActivity::class.java)
            startActivity(intent)
        }
    }
}
