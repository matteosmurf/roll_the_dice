package com.example.myapplication

import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        var numEstratto = intent.getIntExtra("RANDOM", -1)
        val textView = findViewById<TextView>(R.id.activity_Third_textView)

        Thread {
            val source : ImageDecoder.Source = ImageDecoder.createSource(resources, R.drawable.win_gif1)
            val source2 : ImageDecoder.Source = ImageDecoder.createSource(resources, R.drawable.lose_gif1)
            val drawable : Drawable = ImageDecoder.decodeDrawable(source)
            val drawable2 : Drawable = ImageDecoder.decodeDrawable(source2)
            val imageView : ImageView = findViewById<ImageView>(R.id.activity_Third_imageView)

            if (numEstratto>3) {
                imageView.setImageDrawable(drawable)
                (drawable as? AnimatedImageDrawable)?.start()
                textView.text = "Hai vinto!"
            } else {
                imageView.setImageDrawable(drawable2)
                (drawable2 as? AnimatedImageDrawable)?.start()
                textView.text = "Hai perso :("
            }
        }.start()





    }
}