package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "They see me rollin ..."
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randInt = Random.nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randInt.toString()
    }

}