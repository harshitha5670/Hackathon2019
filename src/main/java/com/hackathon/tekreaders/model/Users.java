package com.hackathon.tekreaders.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class Users {

  @Id
  @Column(nullable = false, unique = true)
  private Integer empid;
  @Column(nullable = false, unique = true)
  @Email(message = "Please provide valid email")
  @NotEmpty(message = "Please provide an email")
  private String email;
  @Column
  @NotEmpty(message = "Please provide firstName")
  private String firstname;
  @Column
  @NotEmpty(message = "Please provide lastName")
  private String lastname;
  @Column
  private String gender;
  @Column
  @NotNull
  private String mobilenumber;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "practice", referencedColumnName = "practiceid")
  private Practice practice;

  public Users() {
  }

  public Integer getEmpid() {
    return empid;
  }

  public void setEmpid(Integer empid) {
    this.empid = empid;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getMobilenumber() {
    return mobilenumber;
  }

  public void setMobilenumber(String mobilenumber) {
    this.mobilenumber = mobilenumber;
  }

  public Practice getPractice() {
    return practice;
  }

  public void setPractice(Practice practice) {
    this.practice = practice;
  }

  @Override
  public String toString() {
    return "Users{" +
      ", empid=" + empid +
      ", email='" + email + '\'' +
      ", firstname='" + firstname + '\'' +
      ", lastname='" + lastname + '\'' +
      ", gender='" + gender + '\'' +
      ", mobilenumber='" + mobilenumber + '\'' +
      ", practice=" + practice +
      '}';
  }
}
