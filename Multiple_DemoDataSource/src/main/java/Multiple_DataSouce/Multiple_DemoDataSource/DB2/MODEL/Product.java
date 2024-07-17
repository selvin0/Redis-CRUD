package Multiple_DataSouce.Multiple_DemoDataSource.DB2.MODEL;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="product")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
     private int productId;

     private String name;

     private int price;
}
