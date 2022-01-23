package com.telekom.task.turktelekomtask.repository;


import com.telekom.task.turktelekomtask.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository  extends JpaRepository<Teacher,Long> {


}
