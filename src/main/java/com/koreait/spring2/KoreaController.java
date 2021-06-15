package com.koreait.spring2;

import com.koreait.spring2.VO.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KoreaController {

    @Autowired
    private KoreaService service;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("locationList", service.selLocationCodeEntity());
        return "main";
    }

    @GetMapping("/result")
    public String result() {
        return "";
    }

    @PostMapping("/result")
    public String result(SearchDTO param) {
        service.saveData(param);
        return "redirect:/result";
    }

}
