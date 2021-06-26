package com.udemy.spring.springselenium;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableAsync;

@EntityScan({"com.co.umb.login.management.domain.repository.model.database"})
@SpringBootApplication
@EnableAsync
public class Application {

    
    public static void main(String[] args) {
         ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(Application.class)
		.properties("spring.config.name:local.application")
		.build()
		.run(args);
		 ConfigurableEnvironment configurableEnvironment = applicationContext.getEnvironment();
    }

}
