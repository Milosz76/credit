package pl.credit.suite.mvc.model.dto;

public class ProductDTO {

    private int creditId;
    private String productName;
    private int value;
    private CreditDTO creditDTO;
    private CustomerDTO customerDTO;

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CreditDTO getCreditDTO() {
        return creditDTO;
    }

    public void setCreditDTO(CreditDTO creditDTO) {
        this.creditDTO = creditDTO;
    }

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }
}
