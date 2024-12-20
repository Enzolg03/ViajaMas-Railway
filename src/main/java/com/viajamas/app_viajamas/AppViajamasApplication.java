package com.viajamas.app_viajamas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AppViajamasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppViajamasApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/api/v1/**")
						.allowedMethods("GET","POST","PUT")
						.allowedOrigins("http://localhost:4200/","https://angular-viajamas.onrender.com/");
			}
		};
	}

}
