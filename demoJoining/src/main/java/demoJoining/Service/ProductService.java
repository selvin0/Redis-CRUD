package demoJoining.Service;
import demoJoining.Entity.Product;
import demoJoining.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService
{
     @Autowired
     private ProductRepository productRepository;

     public Product saveProduct(Product product)
     {
         return  productRepository.save(product);
     }
}
