package com.example.quizapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class rating : AppCompatActivity() {

    lateinit var ratingbar: RatingBar
    lateinit var showRating: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        ratingbar=findViewById(R.id.ratingBar) as RatingBar
        showRating=findViewById(R.id.btnShowRating) as Button
        showRating.setOnClickListener(View.OnClickListener{
            Toast.makeText(applicationContext,"your rating ="+ratingbar.rating, Toast.LENGTH_SHORT).show()
        })
    }
}