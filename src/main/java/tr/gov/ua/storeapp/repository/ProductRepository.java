package tr.gov.ua.storeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.gov.ua.storeapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
