package com.example.demo.service.user;

import com.example.demo.exception.UserAlreadyExistException;
import com.example.demo.model.User;
import com.example.demo.service.Service;

public interface UserService extends Service<User> {

    User findByName(String name);
    boolean nameExists(String email);
    void registerNewUserAccount(User user)
            throws UserAlreadyExistException;
    public void update(User model);
//    User findByRole(Role role);
}
