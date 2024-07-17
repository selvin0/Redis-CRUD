package Multiple_DataSouce.Multiple_DemoDataSource.DB1.MODEL;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User
{
     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
     private int userId;

     private String name;

     private int age;
}
