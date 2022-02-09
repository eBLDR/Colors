package com.minimalstudios.colors

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.minimalstudios.colors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnMap: Map<Int, Button> = mapOf(
            ContextCompat.getColor(this, R.color.white) to binding.btn11,
            ContextCompat.getColor(this, R.color.lightGray1) to binding.btn12,
            ContextCompat.getColor(this, R.color.lightRedBerry1) to binding.btn13,
            ContextCompat.getColor(this, R.color.lightRed1) to binding.btn21,
            ContextCompat.getColor(this, R.color.lightOrange1) to binding.btn22,
            ContextCompat.getColor(this, R.color.lightYellow1) to binding.btn23,
            ContextCompat.getColor(this, R.color.lightGreen1) to binding.btn31,
            ContextCompat.getColor(this, R.color.lightCyan1) to binding.btn32,
            ContextCompat.getColor(this, R.color.lightCornflowerBlue1) to binding.btn33,
            ContextCompat.getColor(this, R.color.lightBlue1) to binding.btn41,
            ContextCompat.getColor(this, R.color.lightPurple1) to binding.btn42,
            ContextCompat.getColor(this, R.color.lightMagenta1) to binding.btn43,
        )

        paintButtons(btnMap)
        setOnClickListener(btnMap)
    }

    private fun paintButtons(btnMap: Map<Int, Button>) {
        for ((color, btn) in btnMap) {
            btn.setBackgroundColor(color)
        }
    }

    private fun setOnClickListener(btnMap: Map<Int, Button>) {
        for ((color, btn) in btnMap) {
            btn.setOnClickListener {
                val context = it.context
                val intent = Intent(context, ColorActivity::class.java)
                intent.putExtra(ColorActivity.COLOR, color)
                context.startActivity(intent)
            }
        }
    }
}