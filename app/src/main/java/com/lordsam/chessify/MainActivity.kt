package com.lordsam.chessify

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var currentBox :ImageButton
    private lateinit var currentPiece :Drawable
    var playing = false

    private lateinit var btnA1: ImageButton
    private lateinit var btnC1: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnA1 = findViewById(R.id.boxA1)
        btnC1 = findViewById(R.id.boxC1)

        btnA1.setOnClickListener(this)
        btnC1.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        when (p0!!.id) {

            R.id.boxA1 -> {
                playing = true
                currentBox = btnA1
                currentPiece = btnA1.drawable
            }

            R.id.boxC1 -> {
               currentBox.setImageResource(R.drawable.black_box)
                btnC1.setImageDrawable(currentPiece)
            }
        }


    }


}