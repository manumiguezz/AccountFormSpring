package com.manumiguezz.springboot.EmployeeThymeleaf.controller;

import com.manumiguezz.springboot.EmployeeThymeleaf.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringMVCController {

    @GetMapping("/date")
    public String htmlModel(Model theModel) {
        theModel.addAttribute("theDate", new java.util.Date());
        return "htmlModel";
    }

    @GetMapping("/")
    public String showForm (Model theModel) {
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }
}
