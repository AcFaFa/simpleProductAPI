package com.domain.crudApi.models.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tbl_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

//    primarykey (ID), autoincreament(GeneratedValue)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    setother (Column)
    @Column(name = "product_name", length = 40)
    private String name;

    @Column(name = "product_description", length = 300)
    private String description;

    private double price;

    public Product() {
    }

    public Product(long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
