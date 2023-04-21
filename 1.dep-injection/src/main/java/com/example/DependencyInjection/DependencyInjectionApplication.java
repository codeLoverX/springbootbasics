package com.example.DependencyInjection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
/*
basically has:
1) @ComponentScan (com.example.DependencyInjection.*)
2) @Configuration (can write config here too)
3) NoXml need to import here.
*/

@EnableWebMvc
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

}

/*

Spring multiple ways of defining everything:

1. defining configutation for entire class:
	a) annotations
	b) xml
	c) combination
2. loading configuration file
	a) application context (not preferred)
	b) @inject
3. defining the class itself as a dependency: :
	a) annotations
	b) xml
	c) combination
4. injecting dependencies:
	a) application context (not preferred)
	b) annotation especially @Autowired @@Inject

*/
