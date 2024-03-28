package com.cydeo.spring08mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentContoller {
    @RequestMapping("/student")
    public String getStudentInfo() {
        return "student/welcome.html";
    }

}
