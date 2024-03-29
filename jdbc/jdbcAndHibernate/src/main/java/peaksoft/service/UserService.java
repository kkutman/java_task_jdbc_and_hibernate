package peaksoft.service;

import peaksoft.model.User;

import java.util.List;

public interface UserService {

    String createUsersTable();

    void dropUsersTable();

    String saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}

