package com.example.sport.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document("users")
public class User {
  @Id
  private String id;

  @jakarta.validation.constraints.NotBlank
  @jakarta.validation.constraints.Size(max = 20)
  private String username;

  @jakarta.validation.constraints.NotBlank
  @jakarta.validation.constraints.Size(max = 50)
  @jakarta.validation.constraints.Email
  private String email;

  @jakarta.validation.constraints.NotBlank
  @jakarta.validation.constraints.Size(max = 120)
  private String password;

  @DBRef
  private Role role;

  public User() {
  }

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}