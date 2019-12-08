package com.hackathon.tekreaders.services;

import com.hackathon.tekreaders.model.Users;
import com.hackathon.tekreaders.repository.UsersReppository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class UsersServices {

  @Autowired
  private UsersReppository usersReppository;

  public List<Users> findAllusers() {
    return usersReppository.findAll();
  }

  public Optional<Users> findUserByEmail(String email){
    return usersReppository.findByEmail(email);
  }

  public Optional<Users> findUserByID(Integer integer) {
    return usersReppository.findById(integer);
  }

  public List<Users> addUsers(Users users) {
    usersReppository.save(users);
    return usersReppository.findAll();
  }

  public void saveUser(Users users) {
    usersReppository.save(users);
  }

  public void deleteUser(Integer integer) {
    usersReppository.deleteById(integer);
  }
}
