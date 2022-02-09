package com.minimalstudios.colors

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minimalstudios.colors.databinding.ActivityColorBinding

class ColorActivity : AppCompatActivity() {

    companion object {
        const val COLOR = "color"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityColorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val color = intent?.extras?.get(COLOR)

        if (color is Int) {
            binding.root.setBackgroundColor(color)
        }
    }
}