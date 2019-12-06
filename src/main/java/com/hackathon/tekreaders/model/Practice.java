package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "practice")
public class Practice {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer practiceid;
  @Column
  private String practicename;

  public Integer getPracticeid() {
    return practiceid;
  }

  public void setPracticeid(Integer practiceid) {
    this.practiceid = practiceid;
  }

  public String getPracticename() {
    return practicename;
  }

  public void setPracticename(String practicename) {
    this.practicename = practicename;
  }

  @Override
  public String toString() {
    return "Practice{" +
      "practiceid=" + practiceid +
      ", practicename='" + practicename + '\'' +
      '}';
  }
}
