package com.Ecom.demo.services;

import com.Ecom.demo.moduls.Product;
import com.Ecom.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public void add(Product prod) {
        repo.save(prod);
    }


    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
