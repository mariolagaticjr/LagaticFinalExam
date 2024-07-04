package com.example.daledagreat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class VeigoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_veigo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nextbutton  = findViewById<ImageButton>(R.id.nextbutton)
        nextbutton.setOnClickListener{
            navigateToThreshActivity()
        }
        val imageButton3  = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener{
            navigateToNextActivity()
        }
    }
    private fun navigateToThreshActivity() {
        val intent = Intent(this, ThreshActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToNextActivity() {
        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)
    }
}

