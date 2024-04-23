package com.example.market.domain.reposory;

import com.example.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    //Definimos las reglas que va a tener el dominio al momento de que cualquier repositorio quiera acceder a producto.
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarsProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
