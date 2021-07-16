package com.example.controller;

//import com.example.model.Student;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;

@Controller
public class studentController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hellow(){
        return "hey";
    }
    /**
     * Simply selects the home view to render by returning its name.
     */
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String home(Locale locale, Model model) {
//        System.out.println("Home Page Requested, locale = " + locale);
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//        String formattedDate = dateFormat.format(date);
//
//        model.addAttribute("serverTime", formattedDate);
//
//        return "home";
//    }
//
//    @RequestMapping(value = "/user", method = RequestMethod.POST)
//    public String user(@Validated Student student, Model model) {
//        System.out.println("User Page Requested");
//        model.addAttribute("userName", student.getUserName());
//        return "user";
//    }

}
