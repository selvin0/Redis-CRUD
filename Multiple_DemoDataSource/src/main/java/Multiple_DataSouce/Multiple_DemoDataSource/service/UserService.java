package Multiple_DataSouce.Multiple_DemoDataSource.service;
import Multiple_DataSouce.Multiple_DemoDataSource.DB1.MODEL.User;
import Multiple_DataSouce.Multiple_DemoDataSource.DB1_Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
     @Autowired
     private UserRepository userRepository;

     public User saveUser(User user)
     {
         return userRepository.save(user);
     }
}
