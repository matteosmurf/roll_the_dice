package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var msg = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.activity_Second_textView)
        textView.text = msg

        var imageViewSecond = findViewById<ImageView>(R.id.activity_Second_imageView)
        var random = intent.getIntExtra("RANDOM", -1)
        var resurce = when (random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> {R.drawable.dices}
        }
        imageViewSecond.setImageResource(resurce)
        Log.d("SECOND", "FINITO DISEGNO DADO")
    }
}