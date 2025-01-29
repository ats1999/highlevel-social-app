package com.highlevel.highlevel_api.user.modal;

import com.highlevel.highlevel_api.user.dto.UserDTO;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.Data;

@Entity(name = "\"user\"")
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(unique = true, nullable = false)
  private String email;

  @Column(unique = true)
  private String phoneNumber;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;

  public static User from(UserDTO userDTO) {
    User user = new User();
    user.setEmail(userDTO.getEmail());
    user.setPhoneNumber(userDTO.getPhoneNumber());
    user.setFirstName(userDTO.getFirstName());
    user.setLastName(userDTO.getLastName());
    return user;
  }
}
