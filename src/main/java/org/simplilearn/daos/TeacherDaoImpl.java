package org.simplilearn.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.config.HibConfig;
import org.simplilearn.entities.EClass;
import org.simplilearn.entities.Teacher;

public class TeacherDaoImpl implements TeacherDao{
    SessionFactory factory= HibConfig.getSessionFactory();
    @Override
    public void saveTeacher(Teacher teacher) {
        Session session=factory.openSession();
        Transaction tx=null;
        try {
            tx= session.beginTransaction();
            session.save(teacher);
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

    @Override
    public Teacher getTeacher(int tid) {
        Session session=factory.openSession();
        return session.get(Teacher.class, tid);
    }
}
