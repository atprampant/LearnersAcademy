package org.simplilearn.daos;

import org.simplilearn.entities.Student;



public interface StudentDao {
    void saveStudent(Student student);
    Student getStudent(int sid);

}
