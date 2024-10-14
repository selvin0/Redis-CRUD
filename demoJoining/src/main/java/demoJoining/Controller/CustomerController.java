package demoJoining.Controller;
import demoJoining.Dto.CustomerResponse;
import demoJoining.Entity.Customer;
import demoJoining.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveCustomer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer)
    {
        Customer savedCustomer= customerService.saveCustomer(customer);

        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/getCustomerProductById/{customerId}")
    public CustomerResponse getCustomerProductById(@PathVariable("customerId") int customerId)
    {
        CustomerResponse cutomerResponse= customerService.getCustomerProduct(customerId);
        return cutomerResponse;
    }
}
