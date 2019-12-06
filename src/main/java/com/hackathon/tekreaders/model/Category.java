package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer categoryid;
  @Column
  private String categoryname;

  public Integer getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(Integer categoryid) {
    this.categoryid = categoryid;
  }

  public String getCategoryname() {
    return categoryname;
  }

  public void setCategoryname(String categoryname) {
    this.categoryname = categoryname;
  }

  @Override
  public String toString() {
    return "Category{" +
      "categoryid=" + categoryid +
      ", categoryname='" + categoryname + '\'' +
      '}';
  }
}
