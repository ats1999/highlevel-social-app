package com.highlevel.highlevel_api.user.controller;

import com.highlevel.highlevel_api.user.dto.UserDTO;
import com.highlevel.highlevel_api.user.modal.User;
import com.highlevel.highlevel_api.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public User cretaeUser(@RequestBody @Valid UserDTO userDTO) {
    var user = User.from(userDTO);
    return userService.createUser(user);
  }
}
