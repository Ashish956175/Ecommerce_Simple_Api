package com.Ecom.demo.controller;

import com.Ecom.demo.moduls.Product;
import com.Ecom.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductServices services;


    @GetMapping("/")
    String greet(){
        return "Hello world";
    }

   @GetMapping("/product")
    List<Product> getAllProducts(){
        return services.getAllProducts();
   }

   @GetMapping("/product/{id}")
   Product getProductById(@PathVariable int id){
        return services.getProductById(id);
   }

   @PostMapping("/add")
    void add(@RequestBody Product prod){
        services.add(prod);
   }

   @PutMapping("/product")
    void updateProduct(@RequestBody Product prod){
        services.updateProduct(prod);
   }

   @DeleteMapping("/product/{id}")
    void deleteProduct(@PathVariable int id){
        services.deleteProduct(id);
   }

}
