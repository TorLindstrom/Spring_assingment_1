package org.example;

import data_access.StudentDao;
import management.StudentManagement;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.UserInputService;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);

        context = new AnnotationConfigApplicationContext(ScannerConfig.class);

        UserInputService userInputService = context.getBean(UserInputService.class);

        context = new AnnotationConfigApplicationContext(StudentManagementConfig.class);

        StudentManagement studentManagement = context.getBean(StudentManagement.class);
    }
}
