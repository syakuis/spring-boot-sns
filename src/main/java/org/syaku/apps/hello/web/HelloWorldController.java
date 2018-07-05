package org.syaku.apps.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 5.
 */
@Controller
public class HelloWorldController {
  @GetMapping("/hello")
  public String hello(Model model) {
    model.addAttribute("text", "ok2");
    return "hello";
  }
}
