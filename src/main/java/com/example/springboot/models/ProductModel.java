package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;
import java.math.BigDecimal;


@Entity
@Table(name = "TB_products")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public UUID getIdProduct(){
        return idProduct;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
