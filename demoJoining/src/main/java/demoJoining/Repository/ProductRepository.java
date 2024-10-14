package demoJoining.Repository;
import demoJoining.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Long>
{

}
