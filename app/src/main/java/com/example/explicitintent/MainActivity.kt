package com.example.explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton= findViewById<CardView>(R.id.cardView)
        val cameraButton = findViewById<CardView>(R.id.cardcamera)

        webButton.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://en.wikipedia.org/wiki/Naval_Ravikant")
            startActivity(intent)
        }
        cameraButton.setOnClickListener{
            val intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}