package com.lowes.empapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lowes.empapp.model.*;
import com.lowes.empapp.dao.*;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
