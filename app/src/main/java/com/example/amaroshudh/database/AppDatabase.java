package com.example.amaroshudh.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.amaroshudh.model.Medicine;

@Database(
        entities = {Medicine.class},
        version = 1,
        exportSchema = false
)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MedicineDao medicineDao();
}