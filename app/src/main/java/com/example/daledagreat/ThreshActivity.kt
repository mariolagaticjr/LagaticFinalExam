package com.example.daledagreat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton;

class ThreshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_thresh)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nextbutton = findViewById<ImageButton>(R.id.nextbutton)
        nextbutton.setOnClickListener{
            navigateToNextActivity()
        }
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener{
            navigateToVeigoActivity()
        }
    }
    private fun navigateToNextActivity() {
        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToVeigoActivity() {
        val intent = Intent(this, VeigoActivity::class.java)
        startActivity(intent)
    }
}