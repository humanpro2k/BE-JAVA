package net.java.application.controller;

import net.java.application.entity.Product;
import net.java.application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProduct(id);
    }

    @PostMapping("/product")
    public String saveProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @PostMapping("/products")
    public String saveProducts(@RequestBody List<Product> productList){
        return service.addProducts(productList);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
