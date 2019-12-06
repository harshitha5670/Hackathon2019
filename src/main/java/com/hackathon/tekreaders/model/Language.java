package com.hackathon.tekreaders.model;

import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer languageid;
  @Column
  private String languagename;

  public Integer getLanguageid() {
    return languageid;
  }

  public void setLanguageid(Integer languageid) {
    this.languageid = languageid;
  }

  public String getLanguagename() {
    return languagename;
  }

  public void setLanguagename(String languagename) {
    this.languagename = languagename;
  }

  @Override
  public String toString() {
    return "Language{" +
      "languageid=" + languageid +
      ", languagename='" + languagename + '\'' +
      '}';
  }
}
