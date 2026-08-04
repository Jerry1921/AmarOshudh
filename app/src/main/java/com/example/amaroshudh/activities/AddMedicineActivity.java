package com.example.amaroshudh.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.amaroshudh.R;

//tells that this class is a screen
public class AddMedicineActivity extends AppCompatActivity {

    @Override
    //Runs when the screen opens.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);
    }
}