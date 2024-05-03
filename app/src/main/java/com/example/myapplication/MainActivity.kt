package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onButton1Click(view: View) {
        val imageView = findViewById(R.id.imageView2) as ImageView
        imageView.setImageResource(R.drawable.picture1)
    }

    fun onButton2Click(view: View) {
        val imageView = findViewById(R.id.imageView2) as ImageView
        imageView.setImageResource(R.drawable.picture2)
    }

    fun onButton3Click(view: View) {
        val imageView = findViewById(R.id.imageView2) as ImageView
        imageView.setImageResource(R.drawable.picture3)
    }
}
