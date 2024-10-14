package demoJoining.Controller;
import demoJoining.Entity.Product;
import demoJoining.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class ProductController
{
     @Autowired
     private ProductService productService;

     @PostMapping("/saveProduct")
      public ResponseEntity<Product>saveProduct(@RequestBody Product product)
      {
          Product savedProduct=  productService.saveProduct(product);
          return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
      }
}
