package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);
        //create random student id(0-1000) and show in the UI;
        int studentID = new Random().nextInt();
        model.addAttribute("id",studentID);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        model.addAttribute("numbers",numbers);



        return "/student/welcome";
    }

}
