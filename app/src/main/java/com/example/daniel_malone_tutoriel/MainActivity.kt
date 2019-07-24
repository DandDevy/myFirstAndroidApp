/*
 * Copyright (c) 2019 of Daniel Ashcroft. Use with permission.
 */

package com.example.daniel_malone_tutoriel

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        button.setOnClickListener {
            //prints text to the console
            d("button", "pressed by ${editText.text}!")

            //sets helloworld default textView to text
            helloWorldTV.text="Today is a ${editText.text} day!"

            val userRes = editText.text.toString();
            //if the user has entered bad a sad pic shows up
            if(userRes == "bad"){
                myImage.setImageResource(R.drawable.sadpic)

            } else if(userRes == "good"){
                myImage.setImageResource(R.drawable.happypic)
            }
        }
    }

}
