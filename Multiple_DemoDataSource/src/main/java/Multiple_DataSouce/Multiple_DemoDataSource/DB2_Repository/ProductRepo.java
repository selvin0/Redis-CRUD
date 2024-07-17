package Multiple_DataSouce.Multiple_DemoDataSource.DB2_Repository;
import Multiple_DataSouce.Multiple_DemoDataSource.DB2.MODEL.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>
{

}
