package pl.credit.suite.mvc.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import pl.credit.suite.mvc.model.dto.CustomerDTO;
import pl.credit.suite.mvc.model.entity.Customer;
import pl.credit.suite.mvc.repository.CustomerRepository;

@Service
public class CustomerService {

    private ModelMapper modelMapper;
    private CustomerRepository customerRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    public CustomerService(ModelMapper modelMapper, CustomerRepository customerRepository) {
        this.modelMapper = modelMapper;
        this.customerRepository = customerRepository;
    }

    public void CreateCredit(CustomerDTO customerDTO){
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customerRepository.save(customer);
    }

}
