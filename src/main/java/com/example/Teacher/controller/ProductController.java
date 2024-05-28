/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Teacher.controller;

import com.example.Teacher.model.Product;
import com.example.Teacher.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping(value = {"/product"})
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index")
    public String getProduct(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "Product/index.html";
    }

    @GetMapping("/add")
    public String addProduct() {
        return "Product/add.html";
    }

    @PostMapping("/store")
    public String store(Product product) {
        productRepository.save(product);
        return "redirect:/product/index";
    }
    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") Long id, Model model){
        Product product = productRepository.findById(id).orElseThrow();
        model.addAttribute("product", product);
        return "Product/edit.html";
    }
    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Long id,@ModelAttribute Product pr){
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(pr.getName());
        product.setPrice(pr.getPrice());
        productRepository.save(product);
        return "redirect:/product/index";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        Product  product = productRepository.findById(id).orElseThrow();
        productRepository.delete(product);
        return "redirect:/product/index";
    }
}
