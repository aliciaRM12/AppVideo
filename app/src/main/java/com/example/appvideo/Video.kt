package com.example.appvideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.appvideo.databinding.ActivityVideoBinding

class Video : AppCompatActivity() {
    private lateinit var binding: ActivityVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaC = MediaController(this)
        binding.videoView.setVideoPath("https://s3-videos.uax.es/public/videos/Bien_01.mp4")
        binding.videoView.setMediaController(mediaC)
    }
}