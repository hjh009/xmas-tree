package kr.java.xmastree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChristmasTreeController {

    @GetMapping("/")
    public String showChristmasTree() {
        return "redirect:/christmas-tree.html";
    }
}
