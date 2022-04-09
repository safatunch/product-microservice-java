package com.sha.productservice.model;

import com.sha.productservice.model.base.Model;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products")
public class Product extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private double Price;
}
