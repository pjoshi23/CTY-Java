package com.company;

public class Date {
    private int month;
    private int day;
    private int year;

    public int getMonth() { return month;}
    public void setMonth(int newMonth) {this.month = newMonth;}

    public int getDay() { return day;}
    public void setDay(int newDay) {this.day = newDay;}

    public int getYear() { return year;}
    public void setYear(int newMonth) {this.year = newMonth;}

    Date(){
        month = 1;
        day = 1;
        year = 1980;
    }

    Date(int birthdayMonth, int birthdayDay, int birthdayYear){
        month = birthdayMonth;
        day = birthdayDay;
        year = birthdayYear;

    }

}
