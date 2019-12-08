package com.hackathon.tekreaders.controller;

import com.hackathon.tekreaders.model.Users;
import com.hackathon.tekreaders.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tekreaders")
public class UsersController {

  @Autowired
  private UsersServices usersServices;

  @GetMapping(value = "/users")
  public List<Users> getUsers() {
    return usersServices.findAllusers();
  }

  @GetMapping(value = "/user/{id}")
  public Optional<Users> getUsersById(@PathVariable ("id") Integer integer) {
    return usersServices.findUserByID(integer);
  }

  @GetMapping(value = "/user/getByEmail/{email}")
  public Optional<Users> getUserByEmail(@PathVariable("email") String email) {
    return usersServices.findUserByEmail(email);
  }
  @PostMapping(value = "users/add")
  public List<Users> addUsers(@RequestBody Users users){
    return usersServices.addUsers(users);
  }

  @DeleteMapping(value = "/users/remove/{id}")
  public void deleteUser(Integer integer) {
    usersServices.deleteUser(integer);
  }

}
