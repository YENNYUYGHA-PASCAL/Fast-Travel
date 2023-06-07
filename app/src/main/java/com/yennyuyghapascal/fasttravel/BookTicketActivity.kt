package com.yennyuyghapascal.fasttravel

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class BookTicketActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener {

    private lateinit var originEditText: EditText
    private lateinit var destinationEditText: EditText
    private lateinit var passengersEditText: EditText
    private lateinit var dateEditText: EditText
    private lateinit var oneWayCheckBox: CheckBox
    private lateinit var roundTripCheckBox: CheckBox
    private lateinit var travelTypeRadioGroup: RadioGroup
    private lateinit var takeOffTimeRadioButton: RadioButton
    private lateinit var bookTicketButton: Button

    private var selectedDate: Date? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_ticket)

        originEditText = findViewById(R.id.originEditText)
        destinationEditText = findViewById(R.id.destinationEditText)
        passengersEditText = findViewById(R.id.passengersEditText)
        dateEditText = findViewById(R.id.dateEditText)
        oneWayCheckBox = findViewById(R.id.oneWayCheckBox)
        roundTripCheckBox = findViewById(R.id.roundTripCheckBox)
        travelTypeRadioGroup = findViewById(R.id.travelTypeRadioGroup)
        takeOffTimeRadioButton = findViewById(R.id.takeOffTimeRadioButton)
        bookTicketButton = findViewById(R.id.bookTicketButton)

        dateEditText.setOnClickListener {
            showDatePicker()
        }

        bookTicketButton.setOnClickListener {
            val origin = originEditText.text.toString().trim()
            val destination = destinationEditText.text.toString().trim()
            val passengers = passengersEditText.text.toString().trim().toInt()
            val travelType = when {
                oneWayCheckBox.isChecked -> "One Way"
                roundTripCheckBox.isChecked -> "Round Trip"
                else -> ""
            }
            val selectedTravelType = travelTypeRadioGroup.checkedRadioButtonId
            val takeOffTime = takeOffTimeRadioButton.text.toString()

            if (origin.isEmpty() || destination.isEmpty() || passengers == 0 || selectedDate == null
                || travelType.isEmpty() || selectedTravelType == -1 || takeOffTime.isEmpty()) {
                // Display error message
            } else {
                // Save booking and navigate back to home screen
            }
        }
    }

    private fun showDatePicker() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this, this, year, month, day)
        datePickerDialog.show()
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        val calendar = Calendar.getInstance().apply {
            set(Calendar.YEAR, year)
            set(Calendar.MONTH, month)
            set(Calendar.DAY_OF_MONTH, dayOfMonth)
        }
        selectedDate = calendar.time
        val dateFormat = SimpleDateFormat("dd MMM yyyy")
        dateEditText.setText(dateFormat.format(selectedDate))
    }
}
