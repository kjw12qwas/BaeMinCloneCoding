package com.example.baemin.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.baemin.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_join.*

class JoinActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        auth = FirebaseAuth.getInstance()

        join_login_button.setOnClickListener {

            auth.createUserWithEmailAndPassword(join_email_area.text.toString(), join_password_area.text.toString())
                .addOnCompleteListener(this){task ->
                    if (task.isSuccessful){
                        //Sign in success, update UI with the signed-in user's infomation
                        val intent = Intent(this,JoinInfoActivity::class.java)
                        startActivity(intent)
                    } else {

                        //If sign in fails, display a message to the user.
                        Toast.makeText(baseContext,"회원가입 오류", Toast.LENGTH_SHORT).show()
                    }

                }
        }
    }
}
