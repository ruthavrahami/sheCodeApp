package com.example.sheCodeApp.service;

import com.example.sheCodeApp.dataAccessObject.UserDao;
import com.example.sheCodeApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("com.microsoft.sqlserver") UserDao userDao){
        this.userDao = userDao;
    }
    public int addUser(User user){
        return userDao.insertUser(user);
    }
    public List<User> getAllUsers(){
        return userDao.selectAllUsers();
    }
    public Optional<User> getAllUsersById(UUID id){
        return userDao.selectUserById(id);
    }
    public int deleteUserById(UUID id){
        return userDao.deleteUserById(id);
    }
    public int updateUserById(UUID id, User newUser){
        return userDao.updateUserById(id, newUser);
    }

}
