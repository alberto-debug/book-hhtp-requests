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
    private int quantity;

    public Book(){
        this.releaseDate = LocalDate.now();
    }

    public Book(String name, LocalDate releaseDate, boolean stockStatus, int quantity){

        this.name = name;
        this.stockStatus = stockStatus;
        this.releaseDate = LocalDate.now();
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStockStatus(){
        return stockStatus ? "In Stock" : "Out of Stock";
    }

    public String getQuantityNumber(){
        return "you have " + quantity + " Books in Stock";
    }

}
