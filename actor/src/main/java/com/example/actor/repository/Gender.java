package com.example.actor.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "gender")
public class Gender {

  @Id
  @Column(name="id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  @Column(name="name", nullable=false)
  private String name;
  @Column(name="othername", nullable=false)
  private String othername;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getOthrename() {
    return othername;
  }
  public void setOthername(String othername) {
    this.othername = othername;
  }
  @Override
  public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
  }
}