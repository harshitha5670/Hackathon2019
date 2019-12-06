package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Integer empid;
  @Column
  private String firstname;
  @Column
  private String lastname;
  @Column
  private String gender;
  @Column
  private String mobilenumber;
  @Column
  private String email;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "practice", referencedColumnName = "practiceid")
  private Practice practice;


  public Integer getEmpid() {
    return empid;
  }

  public void setEmpid(Integer empid) {
    this.empid = empid;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
      ", firstname='" + firstname + '\'' +
      ", lastname='" + lastname + '\'' +
      ", gender='" + gender + '\'' +
      ", mobilenumber='" + mobilenumber + '\'' +
      ", email='" + email + '\'' +
      ", practice=" + practice +
      '}';
  }
}
