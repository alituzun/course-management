package com.telekom.task.turktelekomtask.service;

import com.telekom.task.turktelekomtask.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);
    Teacher updateTeacher(Teacher teacher);

    void deleteTeacherById(long id);
}
