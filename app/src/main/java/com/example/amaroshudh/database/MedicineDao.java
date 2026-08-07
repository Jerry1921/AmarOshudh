package com.example.amaroshudh.database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.amaroshudh.model.Medicine;

import java.util.List;

@Dao
public interface MedicineDao {

    @Insert
    void insert(Medicine medicine);

    @Query("SELECT * FROM medicines")
    List<Medicine> getAllMedicines();

    @Delete
    void delete(Medicine medicine);
}
