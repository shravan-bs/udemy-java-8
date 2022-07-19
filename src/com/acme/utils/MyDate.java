package com.acme.utils;

public class MyDate {
    public int day;
    public int month;
    public int year;

    public MyDate() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

}
