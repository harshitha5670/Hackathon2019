package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "sponsor")
public class Sponsor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer sponsorid;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "empid",referencedColumnName = "empid")
  private Users users;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "isbn",referencedColumnName = "isbn")
  private Books book;

  public Integer getSponsorid() {
    return sponsorid;
  }

  public void setSponsorid(Integer sponsorid) {
    this.sponsorid = sponsorid;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public Books getBook() {
    return book;
  }

  public void setBook(Books book) {
    this.book = book;
  }

  @Override
  public String toString() {
    return "Sponsor{" +
      "sponsorid=" + sponsorid +
      ", users=" + users +
      ", book=" + book +
      '}';
  }
}
