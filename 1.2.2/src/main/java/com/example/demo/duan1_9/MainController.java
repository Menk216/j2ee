package com.example.demo.duan1_9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @GetMapping("/personList")
    public String personList(Model model) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
        
        model.addAttribute("persons", persons);
        return "duan1_9/personList";
    }
}
