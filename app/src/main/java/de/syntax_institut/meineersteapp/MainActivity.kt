package de.syntax_institut.meineersteapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            startAnimation()
        }
    }

    private fun startAnimation() {
        val animation = imageView.animate()
        animation.duration = 1000
        animation.withEndAction {
            showResult()
        }
        animation.rotationYBy(5*360f)
    }

    private fun showResult() {
        if (Random.nextBoolean()) {
            textView.text = "Zahl!"
            imageView.setImageResource(R.drawable.zahl)
        } else {
            textView.text = "Kopf!"
            imageView.setImageResource(R.drawable.kopf)
        }
    }
}