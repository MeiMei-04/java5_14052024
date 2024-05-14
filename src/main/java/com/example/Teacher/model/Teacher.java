/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Teacher.model;

import java.io.Serializable;

/**
 *
 * @author HieuCute
 */
public class Teacher implements Serializable{
    private String name;
    private String email;
    private int yearBirth;
    private int salary;
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
