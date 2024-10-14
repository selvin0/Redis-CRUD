package demoJoining.Entity;
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
      private long id;
      private String productName;
      private String productCategory;
}
