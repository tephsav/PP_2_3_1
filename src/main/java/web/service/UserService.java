package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void addUser(User user);

    void deleteUser(Long id);

    User findById(Long id);
}
