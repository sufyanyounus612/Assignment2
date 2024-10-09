package com.example.assignmentno2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class DescriptionActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        val imageUrl = intent.getStringExtra("imageUrl")
        val headline = intent.getStringExtra("headline")
        val timeView = intent.getStringExtra("time")
        val descriptionView = intent.getStringExtra("description")

        val image: ImageView = findViewById(R.id.imageView2)
        val title: TextView = findViewById(R.id.textView4)
        val time: TextView = findViewById(R.id.textView5)
        val description: TextView =findViewById(R.id.description)

        // Load the image using Glide
        Glide.with(this)
            .load(imageUrl)
            .placeholder(R.drawable.error_image)
            .error(R.drawable.error_image)
            .into(image)

        // Set the text data
        title.text = headline
        time.text = timeView
        description.text=descriptionView
    }
}