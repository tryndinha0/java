package com.example.productmanagementmodel;

import jakarta.persistence.*; // importe do pacote jakarta.persistence
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "products") 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column(nullable = false)
    private String name; 

    @Column(nullable = false)
    private Double price; 

    @Column(length = 500) //imita o tamanho da descrição
    private String description; 

    @Column(nullable = false)
    private Integer quantity; 
}