package dao;

import model.User;

public interface UserDao {

    User getUserById(int id);

    User getUserByUsername(String username);

    int createUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);
}