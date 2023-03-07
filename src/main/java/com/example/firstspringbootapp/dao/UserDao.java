package com.example.firstspringbootapp.dao;




import com.example.firstspringbootapp.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUser();


    void save(User user);

    User getUser(long id);


    void update(Long id, User updateUser);

    void delete(Long id);
}
