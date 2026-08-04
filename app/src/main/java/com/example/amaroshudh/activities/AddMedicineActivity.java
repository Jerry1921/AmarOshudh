package com.example.amaroshudh.activities;

import android.app.TimePickerDialog;
import java.util.Calendar;
import java.util.Locale;


import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.amaroshudh.R;
import com.google.android.material.button.MaterialButton;

//tells that this class is a screen
public class AddMedicineActivity extends AppCompatActivity {

    @Override
    //Runs when the screen opens.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);
        MaterialButton btnSelectTime = findViewById(R.id.btnSelectTime);

        btnSelectTime.setOnClickListener(v -> {

            Calendar calendar = Calendar.getInstance();

            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    AddMedicineActivity.this,

                    (view, selectedHour, selectedMinute) -> {

                        String time = String.format(
                                Locale.getDefault(),
                                "%02d:%02d",
                                selectedHour,
                                selectedMinute
                        );

                        btnSelectTime.setText(time);

                    },

                    hour,
                    minute,
                    false
            );

            timePickerDialog.show();

        });
    }
}