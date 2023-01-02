package org.simplilearn.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.simplilearn.config.HibConfig;
import org.simplilearn.entities.EClass;
import org.simplilearn.entities.Student;
import org.simplilearn.entities.Subject;
import org.simplilearn.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ShowLists {
    SessionFactory factory= HibConfig.getSessionFactory();
    public List<Student> showStudents()
    {
        List<Student> students = null;
        Session session = factory.openSession();
        Query<Student> query = session.createQuery("select s from org.simplilearn.entities.Student s");
        students = query.getResultList();
        return students;
    }
    public List<Teacher> showTeachers()
    {
        List<Teacher> teachers = null;
        Session session = factory.openSession();
        Query<Teacher> query = session.createQuery("select t from org.simplilearn.entities.Teacher t");
        teachers=query.getResultList();
        return teachers;
    }
    public List<EClass> showClasses()
    {
        List<EClass> classes = null;
        Session session=factory.openSession();
        Query<EClass> query = session.createQuery("select c from org.simplilearn.entities.EClass c");
        classes=query.getResultList();
        return classes;
    }
    public List<Subject> showSubjects()
    {
        List<Subject> subjects=null;
        Session session= factory.openSession();
        Query<Subject> query = session.createQuery("select s from org.simplilearn.entities.Subject s");
        subjects=query.getResultList();
        return subjects;
    }
}
