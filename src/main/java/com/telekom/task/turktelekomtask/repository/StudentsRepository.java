package com.telekom.task.turktelekomtask.repository;

import com.telekom.task.turktelekomtask.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentsRepository extends JpaRepository<Student,Long> {

}
