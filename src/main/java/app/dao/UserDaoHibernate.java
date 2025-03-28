package app.dao;

import app.model.User;

import java.util.List;

public interface UserDaoHibernate {
    void save(User user);

    void deleteById(int id);

    List<User> getAll();

    User findById(int id);
}
