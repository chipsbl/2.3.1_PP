package app.service;

import app.model.User;
import java.util.List;

public interface UserService {
    void save(User user);

    void delete(Long id);

    void update(User user, Long id);

    List<User> getAll();

    User findById(Long id);
}
