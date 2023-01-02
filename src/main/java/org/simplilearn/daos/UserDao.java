package org.simplilearn.daos;

import org.simplilearn.entities.User;

public interface UserDao {
    void saveUser(User user);
    boolean getUser(String username, String password);
}

