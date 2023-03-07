package com.example.firstspringbootapp.service;



import com.example.firstspringbootapp.models.User;

import java.util.List;

public interface UserService {

    User getUser(long id);
    void save(User user);

    List<User> getUsers();
    void update(Long id, User updateUser);
    void delete(Long id);
}
