package com.yennyuyghapascal.fasttravel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var searchEditText: EditText
    private lateinit var searchButton: Button
    private lateinit var flightRadioButton: RadioButton
    private lateinit var busRadioButton: RadioButton
    private lateinit var railRadioButton: RadioButton
    private lateinit var searchTypeRadioGroup: RadioGroup
    private lateinit var bookTicketButton: Button
    private lateinit var pastDataButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchEditText = findViewById(R.id.searchEditText)
        searchButton = findViewById(R.id.searchButton)
        flightRadioButton = findViewById(R.id.flightRadioButton)
        busRadioButton = findViewById(R.id.busRadioButton)
        railRadioButton = findViewById(R.id.railRadioButton)
        searchTypeRadioGroup = findViewById(R.id.searchTypeRadioGroup)
        bookTicketButton = findViewById(R.id.bookTicketButton)
        pastDataButton = findViewById(R.id.pastDataButton)

        searchButton.setOnClickListener {
            val searchQuery = searchEditText.text.toString().trim()
            val searchType = when (searchTypeRadioGroup.checkedRadioButtonId) {
                R.id.flightRadioButton -> "flight"
                R.id.busRadioButton -> "bus"
                R.id.railRadioButton -> "rail"
                else -> ""
            }

            if (searchQuery.isEmpty() || searchType.isEmpty()) {
                // Display error message
            } else {
                // Perform search and display results
            }
        }

        bookTicketButton.setOnClickListener {
            val searchType = when (searchTypeRadioGroup.checkedRadioButtonId) {
                R.id.flightRadioButton -> "flight"
                R.id.busRadioButton -> "bus"
                R.id.railRadioButton -> "rail"
                else -> ""
            }

            if (searchType.isEmpty()) {
                // Display error message
            } else {
                // Navigate to ticket booking screen
            }
        }

        pastDataButton.setOnClickListener {
            // Retrieve past booking data and display it
        }
    }
}