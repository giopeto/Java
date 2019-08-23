package com.websystem.dao.impl;

import org.springframework.stereotype.Repository;

import com.websystem.bean.User;
import com.websystem.dao.IUserDAO;


@Repository
public class UserDAO extends AbstractDAO<User> implements IUserDAO {

    public UserDAO() {
        super(User.class);
    }

    @Override
    public User login(String username, String password) {
//    public User login(String email) {
        // TODO: implement me!
        return null;
    }

}
