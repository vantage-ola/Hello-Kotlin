package com.example.expressyourself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "Ola"
        val yearOfBirth = 2003
        var currentYear = 2021
        val age: Int


        age = currentYear - yearOfBirth
        Log.i("info", "$age")

        currentYear++
        Log.i("info", "$name was born in $yearOfBirth and is $age years old. Next year he will be ${currentYear - yearOfBirth} years old)")
    }
}