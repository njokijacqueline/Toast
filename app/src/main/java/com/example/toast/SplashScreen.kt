package com.example.toast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SplashScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val btnTst:Button = findViewById(R.id.btnToast)
        val btnInt:Button = findViewById(R.id.btnExpInt)

        btnTst.setOnClickListener {
            Toast.makeText(this,"This is my toast Message", Toast.LENGTH_SHORT).show()
        }

        btnInt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}