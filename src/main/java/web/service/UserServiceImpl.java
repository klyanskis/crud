package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }
}
