package pl.credit.suite.mvc.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import pl.credit.suite.mvc.model.dto.CreditDTO;
import pl.credit.suite.mvc.model.entity.Credit;
import pl.credit.suite.mvc.repository.CreditRepository;

@Service
public class CreditService {

    private ModelMapper modelMapper;
    private CreditRepository creditRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    public CreditService(ModelMapper modelMapper, CreditRepository creditRepository) {
        this.modelMapper = modelMapper;
        this.creditRepository = creditRepository;
    }

    public void CreateCredit(CreditDTO creditDTO){
        Credit credit = modelMapper.map(creditDTO,Credit.class);
        creditRepository.save(credit);
    }

}
