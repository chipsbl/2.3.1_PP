package app.dao;

import app.model.User;

import java.util.List;

public interface UserDaoHibernate {
    void save(User user);
    void delete(User user);
    void update(User user);
    List<User> getAll();
}
