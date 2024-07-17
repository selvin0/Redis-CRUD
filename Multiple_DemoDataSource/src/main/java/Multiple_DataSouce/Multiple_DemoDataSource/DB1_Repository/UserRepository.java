package Multiple_DataSouce.Multiple_DemoDataSource.DB1_Repository;
import Multiple_DataSouce.Multiple_DemoDataSource.DB1.MODEL.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{

}
