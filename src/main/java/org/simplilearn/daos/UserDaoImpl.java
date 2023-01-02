package org.simplilearn.daos;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.simplilearn.config.HibConfig;
import org.simplilearn.entities.User;

import java.sql.*;
import java.util.List;


public class UserDaoImpl implements UserDao {
    SessionFactory factory= HibConfig.getSessionFactory();
    @Override
    public void saveUser(User user) {
        Session session=factory.openSession();
        Transaction tx=null;
        try {
            tx=session.beginTransaction();
            session.save(user);
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        finally {
            session.close();
        }

    }

    @Override
    public boolean getUser(String username, String password) {
//        boolean userexists=false;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atp", "root", "root");
//            PreparedStatement ps = con.prepareStatement("select count(*) from user where username=? && password=?");
//            ps.setString(1, username);
//            ps.setString(2, password);
//            ResultSet rs = ps.executeQuery();
//            int result = 0;
//            if (rs.next()) {
//                result = rs.getInt("count(*)");
//            }
//            if (result >= 1) {
//                userexists = true;
//            }
//            return userexists;
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

//        SQLQuery<User> query=session.createSQLQuery("select username,password from User");
//        query.addEntity(User.class);
//        List<User> users=query.getResultList();
//        User abc=new User();
//        for (User user:users) {
//            if(username.equals(user.getUsername()))
//                if(password.equals(user.getPassword()))
//                    abc=user;
//        }
//        return abc;
//        Query<User> query=session.createQuery("select u from org.simplilearn.entities.User u where u.username= ?1 and u.password= ?2");
//        query.setParameter(1,username);
//        query.setParameter(2,password);
//        return query.getSingleResult();

//
        boolean userexists=false;
        Session session=factory.openSession();
        Query<User> query1=session.createQuery("from org.simplilearn.entities.User");
        List<User> users=query1.getResultList();
        for (User user:users)
        {
            if(username.equals(user.getUsername()))
            {
                if(password.equals(user.getPassword()))
                    userexists=true;
            }
        }
        return userexists;


    }



}
