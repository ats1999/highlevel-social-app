package com.highlevel.highlevel_api.user.service;

import com.highlevel.highlevel_api.user.modal.User;
import com.highlevel.highlevel_api.user.repository.UserRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User createUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public Optional<User> getUserById(UUID id) {
    return userRepository.findById(id);
  }

  @Override
  public User updateUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public void deleteUserById(UUID id) {
    userRepository.deleteById(id);
  }
}
