package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "bookstatus")
public class BookStatus {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer statusid;
  @Column
  private String status;

  public Integer getStatusid() {
    return statusid;
  }

  public void setStatusid(Integer statusid) {
    this.statusid = statusid;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "BookStatusRepository{" +
      "statusid=" + statusid +
      ", status='" + status + '\'' +
      '}';
  }
}
