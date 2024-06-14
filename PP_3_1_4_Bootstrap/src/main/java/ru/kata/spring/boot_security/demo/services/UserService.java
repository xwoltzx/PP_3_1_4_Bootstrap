package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    User findByUsername(String username);

    void saveUser(User user);

    List<User> getAllUsers();

    User showUserById(int id);

    void updateUserById(int id, User updateUser);

    void deleteUserById(int id);
}
