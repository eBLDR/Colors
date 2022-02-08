package com.example.colors

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.colors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnMap: Map<Int, Button> = mapOf(
            ContextCompat.getColor(applicationContext, R.color.white) to binding.btn11,
            ContextCompat.getColor(applicationContext, R.color.lightGray1) to binding.btn12,
            ContextCompat.getColor(applicationContext, R.color.lightRedBerry1) to binding.btn13,
            ContextCompat.getColor(applicationContext, R.color.lightRed1) to binding.btn21,
            ContextCompat.getColor(applicationContext, R.color.lightOrange1) to binding.btn22,
            ContextCompat.getColor(applicationContext, R.color.lightYellow1) to binding.btn23,
            ContextCompat.getColor(applicationContext, R.color.lightGreen1) to binding.btn31,
            ContextCompat.getColor(applicationContext, R.color.lightCyan1) to binding.btn32,
            ContextCompat.getColor(applicationContext, R.color.lightCornflowerBlue1 ) to binding.btn33,
            ContextCompat.getColor(applicationContext, R.color.lightBlue1) to binding.btn41,
            ContextCompat.getColor(applicationContext, R.color.lightPurple1) to binding.btn42,
            ContextCompat.getColor(applicationContext, R.color.lightMagenta1) to binding.btn43,
        )

        paintButtons(btnMap)

        for ((color, btn) in btnMap) {
            btn.setOnClickListener {
                val context = it.context
                val intent = Intent(context, ColorActivity::class.java)
                intent.putExtra(ColorActivity.COLOR, color)
                context.startActivity(intent)
            }
        }
    }

    private fun paintButtons(btnMap: Map<Int, Button>) {
        for ((color, btn) in btnMap) {
            btn.setBackgroundColor(color)
        }
    }
}