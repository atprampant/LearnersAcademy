package org.simplilearn.daos;

import org.simplilearn.entities.Teacher;

public interface TeacherDao {
    void saveTeacher(Teacher teacher);
    Teacher getTeacher(int tid);
}
