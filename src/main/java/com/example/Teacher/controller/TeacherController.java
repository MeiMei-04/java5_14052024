/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Teacher.controller;

import com.example.Teacher.model.Teacher;
import com.example.Teacher.repository.TeacherRepository;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HieuCute
 */
@Controller
@RequestMapping(value = "/Teacher")
public class TeacherController {

    private List<Teacher> Teachers = new ArrayList<>();
    TeacherRepository teacherRepository;

    public TeacherController() {
        teacherRepository = new TeacherRepository();
        Teachers = teacherRepository.fillAll();
    }

    @ModelAttribute("Teachers")
    public List<Teacher> getTeachers() {
        return Teachers;
    }

    @GetMapping("/list")
    public String index() {
        return "Teacher/index";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute("teacher") Teacher teacher) {
        return "Teacher/add";
    }

    @PostMapping("/create")
    public String create(Model model,@Valid Teacher teacher ,BindingResult bindingResult) {
        System.out.println(bindingResult.hasErrors());
        if(bindingResult.hasErrors()){
            List<FieldError> listError = bindingResult.getFieldErrors();
            Map<String,String> errors = new HashMap<>();
            for (FieldError fieldError : listError) {
                errors.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            System.out.println("12344555");
            model.addAttribute("errors", errors);
            model.addAttribute("teacher", teacher);
            return "Teacher/add";
        }
        System.out.println("123");
        teacherRepository.create(teacher);
        return "redirect:/Teacher/list";
    }

    @GetMapping("edit/{index}")
    public String edit(@PathVariable("index") int index, Model model
    ) {
        Teacher teacher = teacherRepository.getName(index);
        model.addAttribute("teacher", teacher);
        model.addAttribute("index", index);
        return "Teacher/edit";
    }
    @PostMapping("update/{index}")
    public String update(Teacher teacher, @PathVariable("index") int index){
        teacherRepository.update(index, teacher);
        return "redirect:/Teacher/list";
    }
    @GetMapping("/delete/{index}")
    public String delete(@PathVariable("index") int index){
        teacherRepository.delete(index);
        return "redirect:/Teacher/list";
    }
}
