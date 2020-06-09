package com.example.sheCodeApp.dataAccessObject;

import com.example.sheCodeApp.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("com.microsoft.sqlserver")
public class UserDataAccessService implements UserDao{

    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> selectAllUsers() {
        return List.of(new User(
                UUID.randomUUID()
                ,"FROM MICROSOPT SQL", "23456" ,"@gmail" ,"ttt","weff","wf"));
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        return 0;
    }
}
