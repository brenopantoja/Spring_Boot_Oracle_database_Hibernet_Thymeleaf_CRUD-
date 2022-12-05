package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;

/*
 * 
 *  Class of repository, where it is using  the class{@link Student} to add, update, delete data of the system
 *  @author Breno R. Pantoja      
 */

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
