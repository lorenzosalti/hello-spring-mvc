package org.lessons.java.hello_spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")
public class HomePageController {

  @GetMapping("/")
  public String homePage() {
    return "home";
  }

  @GetMapping("/detail/{id}")
  public String detailPage(@PathVariable("id") String pageId, @RequestParam(name = "name") String name, Model model) {
    model.addAttribute("pageId", pageId);
    model.addAttribute("name", name);
    return "detail";
  }

}
