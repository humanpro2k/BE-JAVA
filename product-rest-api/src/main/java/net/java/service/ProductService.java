package net.java.service;

import net.java.entity.Product;
import net.java.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public void saveProduct(Product product){
        repo.save(product);
    }

    public void saveProducts(List<Product> productList){
        repo.saveAll(productList);
    }

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getById(int id){
        return repo.findById(id).orElse(null);
    }

//    public Product getByName(String name){
//        return repo.findByName(name);
//    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }

    public Product updateProduct(Product product){
        Product existProduct = repo.findById(product.getId()).orElse(null);
        existProduct.setName(product.getName());
        existProduct.setPrice(product.getPrice());
        return repo.save(existProduct);
    }



}
