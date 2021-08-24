package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Pizza", "Sandwich", "chinese", "Hamburger","Vegetable", "Ice cream")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decideBtn = findViewById<Button>(R.id.decideBtn)
        val selectedFoodTxt = findViewById<TextView>(R.id.selectedFoodTxt)
        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
         }
        val addFoodBtn = findViewById<Button>(R.id.addFoodBtn)
        val addFoodTxt = findViewById<EditText>(R.id.editTextText)
        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            Log.d("TAG", "This is a test log")
        }

    }
}