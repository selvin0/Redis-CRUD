package Multiple_DataSouce.Multiple_DemoDataSource.Controller;

import Multiple_DataSouce.Multiple_DemoDataSource.DB1.MODEL.User;
import Multiple_DataSouce.Multiple_DemoDataSource.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class UserController
{
     @Autowired
     private UserService userService;

     @PostMapping("/saveUser")
     public ResponseEntity<User> save(@RequestBody User user)
     {
            User user1= userService.saveUser(user);
            return new ResponseEntity<>(user1, HttpStatus.CREATED);
     }
}
