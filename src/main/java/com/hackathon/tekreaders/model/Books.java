package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column
  private Integer isbn;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "language",referencedColumnName = "languageid")
  private Language language;
  @Column
  private String title;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "author",referencedColumnName = "authorid")
  private Authors authors;
  @Column
  private Integer pagecount;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "category",referencedColumnName = "categoryid")
  private Category category;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "status", referencedColumnName = "statusid")
  private BookStatus bookStatus;


  public Integer getIsbn() {
    return isbn;
  }

  public void setIsbn(Integer isbn) {
    this.isbn = isbn;
  }

  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Authors getAuthors() {
    return authors;
  }

  public void setAuthors(Authors authors) {
    this.authors = authors;
  }

  public Integer getPagecount() {
    return pagecount;
  }

  public void setPagecount(Integer pagecount) {
    this.pagecount = pagecount;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public BookStatus getBookStatus() {
    return bookStatus;
  }

  public void setBookStatus(BookStatus bookStatus) {
    this.bookStatus = bookStatus;
  }

  @Override
  public String toString() {
    return "Books{" +
      ", isbn=" + isbn +
      ", language=" + language +
      ", title='" + title + '\'' +
      ", authors=" + authors +
      ", pagecount=" + pagecount +
      ", category=" + category +
      ", bookStatus=" + bookStatus +
      '}';
  }
}
