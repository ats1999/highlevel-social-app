package com.highlevel.highlevel_api.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {
  @NotBlank private String email;
  private String phoneNumber;
  @NotBlank private String firstName;
  @NotBlank private String lastName;
}
