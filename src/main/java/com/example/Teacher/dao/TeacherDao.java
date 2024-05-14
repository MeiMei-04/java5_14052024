/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Teacher.dao;

import com.example.Teacher.model.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HieuCute
 */
public class TeacherDao {
    List<Teacher> Teachers = new ArrayList<>();

    public TeacherDao() {
        for(int i = 0;i<10;i++){
            Teachers.add(new Teacher("Name"+i, i+"@gmail.com", 2000+i, i, i));
        }
    }
    public List<Teacher> getTeachers(){
        return Teachers;
    }
    
}
