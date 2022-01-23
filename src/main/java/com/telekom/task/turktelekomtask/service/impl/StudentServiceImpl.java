package com.telekom.task.turktelekomtask.service.impl;

import com.telekom.task.turktelekomtask.entity.Student;
import com.telekom.task.turktelekomtask.repository.StudentsRepository;
import com.telekom.task.turktelekomtask.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl(StudentsRepository studentsRepository) {
        super();
        this.studentsRepository = studentsRepository;
    }

    private StudentsRepository studentsRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentsRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public void deleteStudentById(long id) {
         studentsRepository.deleteById(id);
    }
}
