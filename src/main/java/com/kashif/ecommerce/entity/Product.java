package com.kashif.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "product_id_gen")
    @SequenceGenerator(name = "product_id_gen", sequenceName = "product_id_seq", allocationSize = 1)
    private int id;

    /*
    Many products will be mapped to one category
     */
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private ProductCategory category;

    private String sku;
    private String name;
    private String description;
    @Column(name="unit_price")
    private BigDecimal unitPrice;
    @Column(name="image_url")
    private String imageUrl;
    private boolean active;
    @Column(name="units_in_stock")
    private int unitsInStock;

    /*
     @CreationTimestamp
        Marks a property as the creation timestamp of the containing entity. The property value will be set to the current VM date
        exactly once when saving the owning entity for the first time.
     */
    @Column(name="date_created")
    @CreationTimestamp
    private LocalDate dateCreated;

    /*
     @UpdateTimestamp
    Marks a property as the update timestamp of the containing entity. The property value will be set to the current VM date whenever
    the owning entity is updated.
     */
    @Column(name="last_updated")
    @UpdateTimestamp
    private LocalDate lastUpdated;
}
