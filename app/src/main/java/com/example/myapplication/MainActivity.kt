package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnRoll : Button = findViewById(R.id.activityMain_btn_roll)
        btnRoll.setOnClickListener(View.OnClickListener {
            var toast= Toast.makeText(this, "Lancio del dado!", Toast.LENGTH_LONG)
            toast.show()

            var newIntent : Intent = Intent(this, SecondActivity::class.java)
            var newRandom = (1..6).random()
            newIntent.putExtra("MESSAGE", "numero estratto: $newRandom")
            newIntent.putExtra("RANDOM", newRandom)
            startActivity(newIntent)
        })
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }
}