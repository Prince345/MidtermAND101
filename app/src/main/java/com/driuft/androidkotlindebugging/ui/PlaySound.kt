package com.driuft.androidkotlindebugging.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import android.media.MediaPlayer
import android.view.View

class PlaySound : AppCompatActivity() {
    private val rootView: View get() = findViewById(android.R.id.content)

    private var mediaPlayer: MediaPlayer = MediaPlayer.create(this,R.raw.fanfare_trumpets)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_sound)
        rootView.setBackgroundColor(Color.parseColor("##98ff98"))
        startSound()
    }

    fun startSound() {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(this, R.raw.fanfare_trumpets);
        }
        mediaPlayer?.start()
    }
}