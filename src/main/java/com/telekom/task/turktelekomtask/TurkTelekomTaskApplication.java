package com.telekom.task.turktelekomtask;

import com.telekom.task.turktelekomtask.entity.Student;
import com.telekom.task.turktelekomtask.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TurkTelekomTaskApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TurkTelekomTaskApplication.class, args);
    }

    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public void run(String... args) throws Exception {

        Student o1= new Student("Ali","Tüzün","alitzn1@gmail.com");
        studentsRepository.save(o1);
    }
}
