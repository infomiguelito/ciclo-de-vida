package com.example.ciclodevida

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

var counter = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount = findViewById<TextView>(R.id.tv_contador)
        val btnCount = findViewById<Button>(R.id.button_count)

        if (savedInstanceState != null){
            counter = savedInstanceState.getInt("myCount")
            tvCount.text = counter.toString()
        }

        btnCount.setOnClickListener {
            counter = counter + 1
            tvCount.text = counter.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("myCount", counter)
        super.onSaveInstanceState(outState)
    }

}
