package org.simplilearn.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.config.HibConfig;
import org.simplilearn.entities.EClass;
import org.simplilearn.entities.Student;

public class EClassDaoImpl implements EClassDao{
    SessionFactory factory= HibConfig.getSessionFactory();
    @Override
    public void saveClass(EClass eclass) {
        Session session=factory.openSession();
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

    @Override
    public EClass getClass(int cid) {
        Session session=factory.openSession();
        return session.get(EClass.class, cid);
    }
}
