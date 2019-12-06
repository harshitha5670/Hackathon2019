package com.hackathon.tekreaders.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comments")
public class Comments {

  @Id
  @GeneratedValue
  @Column
  private Integer commentid;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "isbn", referencedColumnName = "isbn")
  private Books books;
  @Column
  private String comments;

  public Integer getCommentid() {
    return commentid;
  }

  public void setCommentid(Integer commentid) {
    this.commentid = commentid;
  }

  public Books getBooks() {
    return books;
  }

  public void setBooks(Books books) {
    this.books = books;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  @Override
  public String toString() {
    return "Comments{" +
      "commentid=" + commentid +
      ", books=" + books +
      ", comments='" + comments + '\'' +
      '}';
  }
}
