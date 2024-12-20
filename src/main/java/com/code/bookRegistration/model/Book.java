package com.code.bookRegistration.model;


import jakarta.persistence.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate releaseDate;
    private boolean stockStatus;

    public Book(){
        this.releaseDate = LocalDate.now();
    }

    public Book(String name, LocalDate releaseDate, boolean stockStatus){

        this.name = name;
        this.stockStatus = stockStatus;
        this.releaseDate = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(boolean stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getStockStatus(){
        return stockStatus ? "In Stock" : "Out of Stock";
    }

}
