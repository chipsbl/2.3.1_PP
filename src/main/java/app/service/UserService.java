package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(User user);
    void update(User user, int id);
    List<User> getAll();
    User findById(int id);
}
