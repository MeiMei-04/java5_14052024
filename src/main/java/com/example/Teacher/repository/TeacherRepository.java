/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Teacher.repository;

import com.example.Teacher.model.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HieuCute
 */
public class TeacherRepository {
    private List<Teacher> Teachers = new ArrayList<>();

    public TeacherRepository() {
        for (int i = 0; i < 10; i++) {
            Teachers.add(new Teacher("hieu"+i, "hieu"+i, 2000+i, i, i));
        }
    }
    public List<Teacher> fillAll(){
        return Teachers;
    }
    public void create(Teacher teacher){
        Teachers.add(teacher);
    }
    public void update(int index,Teacher teacher){
        Teachers.set(index, teacher);
    }
    public void delete(int index){
        Teachers.remove(index);
    }
    public Teacher getName(int index){
        return Teachers.get(index);
    }
}
