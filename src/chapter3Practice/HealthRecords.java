package chapter3Practice;

import java.time.LocalDate;
import java.time.Period;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private int height;
    private int weight;

    public HealthRecords(String firstName, String lastName, String gender, int day, int month,
                         int year, int height, int weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        if (day > 31){throw new IllegalArgumentException();}
        this.day = day;
        if (month > 12){throw new IllegalArgumentException();}
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setDay(int day) {
        if (day > 31)throw new IllegalArgumentException();
        this.day = day;
    }

    public void setMonth(int month) {
        if (month > 12)throw new IllegalArgumentException();
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHeight(int height) {
        if (height <= 0)throw new IllegalArgumentException();
        this.height = height;
    }

    public void setWeight(int weight) {
        if (weight <= 0)throw new IllegalArgumentException();
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int ageInYears(int year) {
//        LocalDate dateOfBirth = LocalDate.of(year,month,day);
//        LocalDate currentDate = LocalDate.now();
//        Period ageInYears = Period.between(dateOfBirth,currentDate);
        return LocalDate.now().getYear()-year;
    }

    public int maxHeartRate(int day, int month, int year) {
        //LocalDate dateOfBirth = LocalDate.of(year,month,day);
        //LocalDate currentDate = LocalDate.now();
        //Period ageInYears = Period.between(dateOfBirth,currentDate);
        return 220 - ageInYears(year);
    }

    public int targetHeartRate(int day,int month,int year) {
        return maxHeartRate(day,month,year) - 50;
    }

    public int bmiCalculator(int weight,int height) {
        return weight * 703 / (height * height);



    }
}