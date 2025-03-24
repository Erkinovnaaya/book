package com.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="MyBooks")
public class MyBookList {

    @Id
    private int id;
    private String name;
    private String author;
    private String price;

}
