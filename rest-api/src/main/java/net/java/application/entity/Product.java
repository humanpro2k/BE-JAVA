package net.java.application.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private float price;
}
