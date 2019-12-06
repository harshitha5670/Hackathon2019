package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "returnstatus")
public class ReturnStatus {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer returnid;
  @Column
  private String status;

  public Integer getReturnid() {
    return returnid;
  }

  public void setReturnid(Integer returnid) {
    this.returnid = returnid;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ReturnStatus{" +
      "returnid=" + returnid +
      ", status='" + status + '\'' +
      '}';
  }
}
