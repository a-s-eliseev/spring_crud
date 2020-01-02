package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> listUsers();
    void deleteUser(User user);
    User getUser(Long id);
    void editUser(User user);
}
