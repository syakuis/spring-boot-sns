package org.syaku.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Seok Kyun. Choi. 최석균 (Syaku)
 * @since 2018. 7. 5.
 */
@SpringBootApplication(scanBasePackages = "org.syaku.apps")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
