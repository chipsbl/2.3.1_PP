package app.dao;

import app.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDaoHibernate {
    void save(User user);
    void delete(User user);
    List<User> getAll();
    User findById(int id);
}
