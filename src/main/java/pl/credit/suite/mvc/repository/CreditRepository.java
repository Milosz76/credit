package pl.credit.suite.mvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.credit.suite.mvc.model.entity.Credit;

public interface CreditRepository extends JpaRepository<Credit,Integer> {

}
