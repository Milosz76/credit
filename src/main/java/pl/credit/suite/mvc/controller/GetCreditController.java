package pl.credit.suite.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.credit.suite.mvc.model.dto.CreditDTO;
import pl.credit.suite.mvc.model.dto.CustomerDTO;
import pl.credit.suite.mvc.model.dto.ProductDTO;
import pl.credit.suite.mvc.service.CreditService;
import pl.credit.suite.mvc.service.CustomerService;
import pl.credit.suite.mvc.service.ProductService;

@Controller
public class GetCreditController {
    private static final Logger logger = LoggerFactory.getLogger(GetCreditController.class);

    private CreditService creditService;
    private CustomerService customerService;
    private ProductService productService;

    public GetCreditController(CreditService creditService, CustomerService customerService, ProductService productService) {
        this.creditService = creditService;
        this.customerService = customerService;
        this.productService = productService;
    }

    @GetMapping("/getcredit")
    public ModelAndView getCredit(){
        return new ModelAndView("getcredit","getCreditModel", new CreditDTO());
    }

    @PostMapping("/getcredit")
    public String addCreditInfo(@ModelAttribute CreditDTO creditDTO, CustomerDTO customerDTO, ProductDTO productDTO){
        logger.warn("saving form getcredit info to the DB");
        System.out.println(creditDTO.getCreditName() + " " + customerDTO.getFirstName() + " " + productDTO.getProductName());
        creditService.CreateCredit(creditDTO);
        customerService.CreateCredit(customerDTO);
        productService.CreateCredit(productDTO);
        return "credit-info-added";
    }
}
