package com.hackathon.tekreaders.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "borrower")
public class Borrower {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer borrowid;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "empid",referencedColumnName = "empid")
  private Users users;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "isbn" ,referencedColumnName = "isbn")
  private Books books;
  @Column
  private Date borrowdate;
  @Column
  private Date returndate;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "status",referencedColumnName = "returnid")
  private ReturnStatus status;

  public Integer getBorrowid() {
    return borrowid;
  }

  public void setBorrowid(Integer borrowid) {
    this.borrowid = borrowid;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public Books getBooks() {
    return books;
  }

  public void setBooks(Books books) {
    this.books = books;
  }

  public Date getBorrowdate() {
    return borrowdate;
  }

  public void setBorrowdate(Date borrowdate) {
    this.borrowdate = borrowdate;
  }

  public Date getReturndate() {
    return returndate;
  }

  public void setReturndate(Date returndate) {
    this.returndate = returndate;
  }

  public ReturnStatus getStatus() {
    return status;
  }

  public void setStatus(ReturnStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Borrower{" +
      "borrowid=" + borrowid +
      ", users=" + users +
      ", books=" + books +
      ", borrowdate=" + borrowdate +
      ", returndate=" + returndate +
      ", status=" + status +
      '}';
  }
}
