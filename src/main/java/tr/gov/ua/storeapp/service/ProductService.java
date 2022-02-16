package tr.gov.ua.storeapp.service;

import tr.gov.ua.storeapp.entity.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long id);
    void deleteProduct(long id);



}
