package demoJoining.Repository;
import demoJoining.Dto.CustomerResponse; // Ensure correct spelling of 'CustomerResponse'
import demoJoining.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Long>
{
    @Query("SELECT new demoJoining.Dto.CustomerResponse(e.customerName,e.customerId,e.email,f.productName,f.productCategory) " +
            "FROM Customer e INNER JOIN Product f ON e.productId = f.id WHERE e.id = ?1")
    public CustomerResponse getCustomerProduct(int customerId);
}
