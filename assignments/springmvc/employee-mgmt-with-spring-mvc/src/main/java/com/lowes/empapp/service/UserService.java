package com.lowes.empapp.service;

import com.lowes.empapp.model.*;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
