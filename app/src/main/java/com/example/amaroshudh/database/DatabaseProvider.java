package com.example.amaroshudh.database;

//package com.nightel.amaroshudh.database;

import android.content.Context;

import androidx.room.Room;

public class DatabaseProvider {

    private static AppDatabase database;

    public static AppDatabase getDatabase(Context context) {

        if (database == null) {

            database = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "amaroshudh_database"
            ).build();
        }

        return database;
    }
}