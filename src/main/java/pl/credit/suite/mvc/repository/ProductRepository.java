package pl.credit.suite.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.credit.suite.mvc.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
