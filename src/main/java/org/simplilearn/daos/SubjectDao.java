package org.simplilearn.daos;

import org.simplilearn.entities.Subject;

public interface SubjectDao {
    void saveSubject(Subject subject);
    Subject getSubject(int subid);
}
