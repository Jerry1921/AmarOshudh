package com.example.amaroshudh.model;

public class Medicine {

    private String medicineName;
    private String reminderTime;
    private String mealTime;
    private int duration;
    private String durationUnit;

    public Medicine() {
    }

    public Medicine(String medicineName,
                    String reminderTime,
                    String mealTime,
                    int duration,
                    String durationUnit) {

        this.medicineName = medicineName;
        this.reminderTime = reminderTime;
        this.mealTime = mealTime;
        this.duration = duration;
        this.durationUnit = durationUnit;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(String reminderTime) {
        this.reminderTime = reminderTime;
    }

    public String getMealTime() {
        return mealTime;
    }

    public void setMealTime(String mealTime) {
        this.mealTime = mealTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }
}