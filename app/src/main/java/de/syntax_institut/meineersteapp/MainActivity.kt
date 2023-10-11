package de.syntax_institut.meineersteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.imageView)

        button.setOnClickListener {
            if (Random.nextBoolean()) {
                imageView.setImageResource(R.drawable.zahl)
            } else {
                imageView.setImageResource(R.drawable.kopf)
            }
        }
    }
}