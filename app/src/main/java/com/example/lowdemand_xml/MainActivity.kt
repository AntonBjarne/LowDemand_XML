package com.example.lowdemand_xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner


class MainActivity : AppCompatActivity() {

    private lateinit var dropdownButton: Button
    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dropdownButton = findViewById(R.id.dropdown_button)
        spinner = findViewById(R.id.spinner)

        // Set an OnClickListener on the Button
        dropdownButton.setOnClickListener {
            // Programmatically trigger the Spinner's dropdown menu to show
            spinner.performClick()
        }

        val items = resources.getStringArray(R.array.dropdown_menu).toMutableList()

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            items
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
    }
}