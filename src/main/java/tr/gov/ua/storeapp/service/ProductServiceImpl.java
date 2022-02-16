package tr.gov.ua.storeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.gov.ua.storeapp.entity.Product;
import tr.gov.ua.storeapp.exception.ProductNotFoundException;
import tr.gov.ua.storeapp.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {

        Product productDB = null;
        Optional<Product> productOpt = productRepository.findById(product.getId());

        if (productOpt.isPresent())
        {
            productDB = productOpt.get();
            productDB.setName(product.getName());
            productDB.setDescription(product.getDescription());
            productDB.setPrice(product.getPrice());
            return productRepository.save(productDB);
        }
        else
        {
            throw new ProductNotFoundException(product.getId()+" nolu ürün bulunamadı!");
        }

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public void deleteProduct(long id) {

    }
}
