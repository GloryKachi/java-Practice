package chapter3Practice;

import java.time.LocalDate;
import java.time.Period;

public class TargetHeartRate {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;


    public TargetHeartRate(String firstName,String lastName,int month,int day,int year){
        this.firstName = firstName;
        this.lastName = lastName;
        if (month > 12){throw new IllegalArgumentException();
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int calculateAgeInYears(int day,int month,int year) {
        LocalDate birthDay = LocalDate.of(year, month, day);
        LocalDate presentDay = LocalDate.now();
        Period ageInYears = Period.between(birthDay, presentDay);
        return ageInYears.getYears();
    }
    public int maximumHeartRate(int day,int month,int year) {
        //LocalDate birthDay = LocalDate.of(year,month,day);
        //LocalDate presentDay = LocalDate.now();
        //Period ageInYears = Period.between(birthDay,presentDay);
        return 220 - calculateAgeInYears(day,month,year);

    }

    public int getTargetHeartRate(int day,int month,int year) {
        return maximumHeartRate(day, month, year) - 50;
    }

}
