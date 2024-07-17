package Multiple_DataSouce.Multiple_DemoDataSource.service;
import Multiple_DataSouce.Multiple_DemoDataSource.DB2.MODEL.Product;
import Multiple_DataSouce.Multiple_DemoDataSource.DB2_Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
       @Autowired
       private ProductRepo productRepo;

       public Product saveProduct(Product product)
       {
           return productRepo.save(product);
       }
}
