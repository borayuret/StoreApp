package tr.gov.ua.storeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.gov.ua.storeapp.entity.Product;
import tr.gov.ua.storeapp.repository.ProductRepository;

@SpringBootApplication
public class StoreAppApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(StoreAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product();
        p1.setName("Makarna");
        p1.setDescription("Çubuk");
        p1.setPrice(7);

        Product p2 = new Product();
        p2.setName("Salça");
        p2.setDescription("Domates");
        p2.setPrice(15);

        productRepository.save(p1);
        productRepository.save(p2);



    }
}
