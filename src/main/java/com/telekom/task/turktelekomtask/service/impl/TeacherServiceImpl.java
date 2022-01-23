package com.telekom.task.turktelekomtask.service.impl;

import com.telekom.task.turktelekomtask.entity.Teacher;
import com.telekom.task.turktelekomtask.repository.TeachersRepository;
import com.telekom.task.turktelekomtask.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    public TeacherServiceImpl(TeachersRepository teachersRepository) {
        super();
        this.teachersRepository = teachersRepository;
    }

    private TeachersRepository teachersRepository;

    @Override
    public List<Teacher> getAllTeachers() {
        return teachersRepository.findAll();
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teachersRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teachersRepository.findById(id).get();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teachersRepository.save(teacher);
    }

    @Override
    public void deleteTeacherById(long id) {
        teachersRepository.deleteById(id);
    }
}
