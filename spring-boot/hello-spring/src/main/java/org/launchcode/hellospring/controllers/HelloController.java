package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //Handles request at /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring";
    }
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring";
    }

    //Handles request of the form /hello?name=LaunchCode
    @GetMapping("name")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
     }

     // Handles request of the form /hello/Launchcode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, "  + name + "!";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='name'>" +
                "<input type='text' name='name'>" +
                "<input type = 'submit' value= 'Greet Me!'" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
