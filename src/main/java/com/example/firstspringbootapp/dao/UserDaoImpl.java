package com.example.firstspringbootapp.dao;

import com.example.firstspringbootapp.models.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getUser() {
        Session session = entityManager.unwrap(Session.class);
        Query<User> userQuery = session.createQuery("FROM User");
        return userQuery.getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(Long id, User updateUser) {
        entityManager.persist(updateUser);
    }

    @Override
    public void delete(Long id) {
        entityManager.createQuery("DELETE from User WHERE id =: id ").setParameter("id",id).executeUpdate();
    }
}
