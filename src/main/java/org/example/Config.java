package org.example;

import data_access.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import util.UserInputService;

import java.util.Scanner;

public class Config {
}

@Configuration
@ComponentScan("data_access")
class ComponentScanConfig {
}

@Configuration
@ComponentScan("util")
class ScannerConfig {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}

@Configuration
@ComponentScan("management")
@ComponentScan("org.example") //för att den klagade på dependency exception med no bean "scanner" i "scannerService"
class StudentManagementConfig{
    @Bean
    public UserInputService scannerService(){
        return new AnnotationConfigApplicationContext(ScannerConfig.class).getBean(UserInputService.class);
    }
    @Bean
    public StudentDao studentDao(){
        return new AnnotationConfigApplicationContext(ComponentScanConfig.class).getBean(StudentDao.class);
    }
}
