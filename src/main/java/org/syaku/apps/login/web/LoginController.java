package org.syaku.apps.login.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 5.
 */
@Controller
public class LoginController {

  @GetMapping("/login")
  public String login() {
    return "login/login";
  }
}
