/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Teacher.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 *
 * @author HieuCute
 */
public class Teacher implements Serializable{
    @NotBlank(message = "Not NULL")
    private String name;
    @NotBlank(message = "Not NULL")
    private String email;
    @Min(value = 1, message = "Min 0")
    private int yearBirth;
    @Min(value = 1, message = "Min 0")   
    private int salary;
    @Min(value = 0, message = "Hour must be greater than or equal to 0")
    @Max(value = 23, message = "Hour must be less than or equal to 23")
    private int hour;

    public Teacher() {
    }

    public Teacher(String name, String email, int yearBirth, int salary, int hour) {
        this.name = name;
        this.email = email;
        this.yearBirth = yearBirth;
        this.salary = salary;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    
}
