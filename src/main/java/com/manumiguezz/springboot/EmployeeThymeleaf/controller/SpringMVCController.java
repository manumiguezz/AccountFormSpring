package com.manumiguezz.springboot.EmployeeThymeleaf.controller;

import com.manumiguezz.springboot.EmployeeThymeleaf.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringMVCController {

//    @GetMapping("/date")
//    public String htmlModel(Model theModel) {
//        theModel.addAttribute("theDate", new java.util.Date());
//        return "htmlModel";
//    }

    @GetMapping("/processForm")
    public String showForm (Model theModel) {
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {

        if (theBindingResult.hasErrors()) {
            return "customer-form";
        } else return "customer-confirmation";

    }
}
