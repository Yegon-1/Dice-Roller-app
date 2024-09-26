package com.example.diceroller

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.TextView

import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Declare a private variable for the dice value and initialize it to 1
    private var diceValue = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Method to handle the dice roll on button click
    fun rollingDice(view: View) {
        // Generate a random number between 1 and 6
        diceValue = Random.nextInt(1, 7)

        // Find the TextView and display the dice value
        val diceTextView: TextView = findViewById(R.id.dice_value)
        diceTextView.text = diceValue.toString()
    }
}
