/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Teacher.controller;

import com.example.Teacher.dao.TeacherDao;
import com.example.Teacher.model.Teacher;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HieuCute
 */
@Controller
@RequestMapping(value = "/Teacher")
public class TeacherController {
    TeacherDao teacherDao;
    List<Teacher> Teachers;

    public TeacherController() {
        teacherDao = new TeacherDao();
        Teachers = teacherDao.getTeachers();
    }
    @ModelAttribute("Teachers")
    public List<Teacher> getTeachers(){
        return Teachers;
    }
    @GetMapping("/list")
    public String index(){
        return "Teacher/index";
    }
}
