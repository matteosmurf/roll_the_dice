package com.example.myapplication

import android.graphics.ImageDecoder
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        /*val source : ImageDecoder.Source = ImageDecoder.createSource(resources, R.drawable.win_gif1)
        val source2 : ImageDecoder.Source = ImageDecoder.createSource(resources, R.drawable.lose_gif1)
        val drawable : Drawable = ImageDecoder.decodeDrawable(source)
        val drawable2 : Drawable = ImageDecoder.decodeDrawable(source2)
        val imageView : ImageView = findViewById()*/


        var numEstratto = intent.getIntExtra("RANDOM", -1)

    }
}