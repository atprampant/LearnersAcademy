package org.simplilearn.services;

import org.simplilearn.daos.UserDao;
import org.simplilearn.daos.UserDaoImpl;
import org.simplilearn.entities.User;

public class UserService {
        User user=new User();
        UserDao dao=new UserDaoImpl();
        public void createUser(String username,String password){
            user.setUsername(username);
            user.setPassword(password);
            dao.saveUser(user);
        }
        public boolean loginUser(String username,String password){
            boolean status=false;
            status=dao.getUser(username, password);
            return status;
        }
}
