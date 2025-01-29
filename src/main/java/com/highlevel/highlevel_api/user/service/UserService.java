package com.highlevel.highlevel_api.user.service;

import com.highlevel.highlevel_api.user.modal.User;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
  User createUser(User user);

  Optional<User> getUserById(UUID id);

  User updateUser(User user);

  void deleteUserById(UUID id);
}
