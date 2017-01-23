package spittr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpitterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpitterApplication.class, args);
	}
}
