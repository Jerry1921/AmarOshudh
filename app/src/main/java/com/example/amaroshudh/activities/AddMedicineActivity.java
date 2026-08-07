package com.example.amaroshudh.activities;

import android.app.TimePickerDialog;
import java.util.Calendar;
import java.util.Locale;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;


import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.amaroshudh.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

//tells that this class is a screen
public class AddMedicineActivity extends AppCompatActivity {

    private int duration = 1;

    @Override
    //Runs when the screen opens.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);

        Spinner spinner = findViewById(R.id.spinnerDurationType);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.duration_units,
                        android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

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

        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        TextView tvDurationValue = findViewById(R.id.tvDurationValue);

        btnPlus.setOnClickListener(v -> {

            duration++;

            tvDurationValue.setText(String.valueOf(duration));

        });

        btnMinus.setOnClickListener(v -> {

            if (duration > 1) {
                duration--;
                tvDurationValue.setText(String.valueOf(duration));
            }

        });

        MaterialButton btnSaveMedicine = findViewById(R.id.btnSaveMedicine);

        TextInputEditText etMedicineName =
                findViewById(R.id.etMedicineName);

        RadioGroup rgMealTime =
                findViewById(R.id.rgMealTime);

        Spinner spinnerDurationType =
                findViewById(R.id.spinnerDurationType);

        btnSaveMedicine.setOnClickListener(v -> {

            String medicineName =
                    etMedicineName.getText().toString().trim();

            if (medicineName.isEmpty()) {
                etMedicineName.setError("Please enter medicine name");
                etMedicineName.requestFocus();
                return;
            }

            Toast.makeText(this,
                    "Medicine information is valid!",
                    Toast.LENGTH_SHORT).show();

        });

    }
}