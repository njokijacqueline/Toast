package com.example.toast

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.EditText
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNo:EditText = findViewById(R.id.pnNo)

        val btn:Button = findViewById(R.id.implicitBtn)
        checkPermission()

        btn.setOnClickListener {
            val number = edtNo.text.toString()
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$number")
            startActivity(intent)

        }
    }

    fun checkPermission(){
        if (ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this
                , arrayOf(android.Manifest.permission.CALL_PHONE), 181
            )
        }
    }
}
