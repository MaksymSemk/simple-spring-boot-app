package org.l5g7.mealcraft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MealCraftApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MealCraftApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello world!");
    }

}
