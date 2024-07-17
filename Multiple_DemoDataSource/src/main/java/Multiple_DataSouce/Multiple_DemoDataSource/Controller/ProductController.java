package Multiple_DataSouce.Multiple_DemoDataSource.Controller;
import Multiple_DataSouce.Multiple_DemoDataSource.DB2.MODEL.Product;
import Multiple_DataSouce.Multiple_DemoDataSource.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController
{
     @Autowired
     private ProductService productService;

     @PostMapping("/saveProduct")
     public ResponseEntity<Product> saveProduct(@RequestBody Product product)
     {
        Product myProduct=  productService.saveProduct(product);
        return  new ResponseEntity<>(myProduct, HttpStatus.OK);
     }
}
