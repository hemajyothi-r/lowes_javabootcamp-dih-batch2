package com.lowes.empapp.dao;

import com.lowes.empapp.model.*;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
