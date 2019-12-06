package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Authors {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer authorid;
  @Column
  private String firstname;
  @Column
  private String lastname;

  public Integer getAuthorid() {
    return authorid;
  }

  public void setAuthorid(Integer authorid) {
    this.authorid = authorid;
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

  @Override
  public String toString() {
    return "Authors{" +
      "authorid=" + authorid +
      ", firstname='" + firstname + '\'' +
      ", lastname='" + lastname + '\'' +
      '}';
  }
}
