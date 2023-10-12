package com.driuft.androidkotlindebugging.ui

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.Random

class RandomNumber : AppCompatActivity() {

    private val randomNumber: TextView get() = findViewById(R.id.random_number)
    private val rootView: View get() = findViewById(android.R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number)
        rootView.setBackgroundColor(Color.parseColor("#ffff00"))

        val number: Int = (0..100).random()
        randomNumber.text = "$number"
        toast("Today's lucky number is ", randomNumber.text as String)
    }

    fun Context.toast(message: CharSequence, text: String, ) =
        Toast.makeText(this, "Today's lucky number is $String", Toast.LENGTH_SHORT).show()
    fun IntRange.random() =
        Random().nextInt((endInclusive + 1) - start) + start


}