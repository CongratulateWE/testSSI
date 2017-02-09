package com.testSSI.dao;

import com.testSSI.model.User;


public interface UserDao {
    public User getUserByName(String name);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}

