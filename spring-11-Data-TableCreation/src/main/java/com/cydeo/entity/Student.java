package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
