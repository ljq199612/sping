package com.xxx;

import com.xxx.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ApplicationStarter.class, args);
		System.out.println();

    }

	@Autowired
	private User user;

}
