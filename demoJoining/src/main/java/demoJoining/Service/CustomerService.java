package demoJoining.Service;
import demoJoining.Dto.CustomerResponse;
import demoJoining.Entity.Customer;
import demoJoining.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService
{
      @Autowired
      private CustomerRepository customerRepository;

      public Customer saveCustomer(Customer customer)
      {
          return  customerRepository.save(customer);
      }

      public CustomerResponse getCustomerProduct(int customerId)
      {
            return customerRepository.getCustomerProduct(customerId);
      }
}
