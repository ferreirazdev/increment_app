package com.example.myapplication

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var viewBiding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBiding = ActivityResultBinding.inflate(layoutInflater)
        val view = viewBiding.root
        setContentView(view)

        val name = intent.extras?.getString(ARG_NAME)
        viewBiding.title.text = name
    }

    companion object {
        const val ARG_NAME = "ARG_NAME"
    }
}