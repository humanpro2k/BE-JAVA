package net.java.controller;

import net.java.entity.Product;
import net.java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/add-product")
    public String addProduct(@RequestBody Product product){
        service.saveProduct(product);
        return "add " + product.getName() + " success";
    }

    @PostMapping("/add-products")
    public void addProducts(@RequestBody List<Product> productList){
        service.saveProducts(productList);
    }

    @GetMapping("/products")
    public List<Product> findAll(){
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getById(id);
    }

    @PutMapping("/update")
    public Product updateProduct(Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(int id){
        service.deleteProduct(id);
        return "delete success";
    }


}
