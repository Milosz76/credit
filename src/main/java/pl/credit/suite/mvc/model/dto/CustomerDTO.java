package pl.credit.suite.mvc.model.dto;

public class CustomerDTO {

    private int creditId;
    private String firstName;
    private String surname;
    private String pesel;
    private CreditDTO creditDTO;
    private ProductDTO productDTO;

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public CreditDTO getCreditDTO() {
        return creditDTO;
    }

    public void setCreditDTO(CreditDTO creditDTO) {
        this.creditDTO = creditDTO;
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }
}
