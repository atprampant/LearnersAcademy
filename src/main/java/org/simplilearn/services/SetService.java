package org.simplilearn.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.simplilearn.config.HibConfig;
import org.simplilearn.entities.EClass;
import org.simplilearn.entities.Student;
import org.simplilearn.entities.Subject;
import org.simplilearn.entities.Teacher;

public class SetService {

    SessionFactory factory= HibConfig.getSessionFactory();
    public void setTeacher(String subid,int tid){
        Session session=factory.openSession();
        Teacher teacher=session.get(Teacher.class, tid);
        Subject subject=session.get(Subject.class, subid);
        subject.setTeacher(teacher);
        Transaction tx=null;
        try {
            tx= session.beginTransaction();
            session.save(subject);
            tx.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            tx.rollback();
        }
        finally {
            session.close();
        }
    }

    public void setClass(int rollno,int cid){
        Session session=factory.openSession();
        Student student=session.get(Student.class,rollno);
        EClass eclass=session.get(EClass.class,cid);
        student.setEclass(eclass);
        Transaction tx=null;
        try {
            tx= session.beginTransaction();
            session.save(student);
            tx.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            tx.rollback();
        }
        finally {
            session.close();
        }
    }

    public void setSubject(int cid,String subid){
        Session session=factory.openSession();
        EClass eclass=session.get(EClass.class,cid);
        Subject subject=session.get(Subject.class,subid);
        eclass.addSubject(subject);
        Transaction tx=null;
        try {
            tx= session.beginTransaction();
            session.save(eclass);
            tx.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            tx.rollback();
        }
        finally {
            session.close();
        }
    }

}
