package com.driuft.androidkotlindebugging

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.driuft.androidkotlindebugging.ui.*

class MainActivity : AppCompatActivity() {

    private val challengeOneButton: Button get() = findViewById(R.id.challenge_one)
    private val challengeTwoButton: Button get() = findViewById(R.id.challenge_two)
    private val challengeThreeButton: Button get() = findViewById(R.id.challenge_three)
    private val challengeFourButton: Button get() = findViewById(R.id.challenge_four)
    private val challengeFiveButton: Button get() = findViewById(R.id.challenge_five)
    private val challengeSixButton: Button get() = findViewById(R.id.challenge_six)
    private val challengeSevenButton: Button get() = findViewById(R.id.challenge_seven)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        challengeOneButton.setOnClickListener { launchHelloWorldActivity() }
        challengeTwoButton.setOnClickListener { launchNumSumActivity() }
        challengeThreeButton.setOnClickListener { launchCurrentDayActivity() }
        challengeFourButton.setOnClickListener { launchRandomColorActivity() }
        challengeFiveButton.setOnClickListener { launchPrintListActivity() }
        challengeSixButton.setOnClickListener { launchRandomNumberActivity() }
        challengeSevenButton.setOnClickListener { launchPlaySoundActivity() }
    }

    private fun launchHelloWorldActivity() {
        val i = Intent(this, HelloWorldActivity::class.java)
        startActivity(i)
    }

    private fun launchNumSumActivity() {
        val i = Intent(this, NumSumActivity::class.java)
        startActivity(i)
    }

    private fun launchCurrentDayActivity() {
        val i = Intent(this, CurrentDayActivity::class.java)
        startActivity(i)
    }

    private fun launchRandomColorActivity() {
        val i = Intent(this, RandomColorActivity::class.java)
        startActivity(i)
    }

    private fun launchPrintListActivity() {
        val i = Intent(this, PrintListActivity::class.java)
        startActivity(i)
    }

    private fun launchRandomNumberActivity() {
        val i = Intent(this, RandomNumber::class.java)
        startActivity(i)
    }

    private fun launchPlaySoundActivity() {
        val i = Intent(this, PlaySound::class.java)
        startActivity(i)
    }
}