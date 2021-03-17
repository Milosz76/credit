package pl.credit.suite.mvc.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import pl.credit.suite.mvc.model.dto.ProductDTO;
import pl.credit.suite.mvc.model.entity.Product;
import pl.credit.suite.mvc.repository.ProductRepository;

@Service
public class ProductService {

    private ModelMapper modelMapper;
    private ProductRepository productRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    public ProductService(ModelMapper modelMapper, ProductRepository productRepository) {
        this.modelMapper = modelMapper;
        this.productRepository = productRepository;
    }

    public void CreateCredit(ProductDTO productDTO){
        Product product = modelMapper.map(productDTO, Product.class);
        productRepository.save(product);
    }
}
