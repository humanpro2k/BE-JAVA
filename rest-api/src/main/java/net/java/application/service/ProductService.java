package net.java.application.service;

import net.java.application.entity.Product;
import net.java.application.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Product getProduct(int id){
        return repository.findById(id).orElse(null);
    }

    public String addProduct(Product product){
        repository.save(product);
        return "save success";
    }

    public String addProducts(List<Product> productList){
        repository.saveAll(productList);
        return "save success";
    }

    public Product updateProduct(Product product){
        Product oldProduct = repository.findById(product.getId()).orElse(null);
        oldProduct.setName(product.getName());
        oldProduct.setPrice(product.getPrice());
        return oldProduct;
    }

    public String deleteProduct(int id){
        Product product = repository.findById(id).orElse(null);
        if(product != null){
            repository.delete(product);
            return "delete success";
        }
        return "delete failed";
    }


}
