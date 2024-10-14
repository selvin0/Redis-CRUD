package demoJoining.Dto;
public class CustomerResponse
{
    private String customerName;
    private int customerId;
    private String email;
    private String productName;
    private String productCategory;

    public CustomerResponse() {
    }

    public CustomerResponse(String customerName, int customerId, String email, String productName, String productCategory)
    {
        this.customerName = customerName;
        this.customerId = customerId;
        this.email = email;
        this.productName = productName;
        this.productCategory = productCategory;
    }
    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
