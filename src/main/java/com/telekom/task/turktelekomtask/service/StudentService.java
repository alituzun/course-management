package com.telekom.task.turktelekomtask.service;

import com.telekom.task.turktelekomtask.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudentById(long id);
}
