package demoJoining.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="customer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer
{
      @Id
      @GeneratedValue(strategy= GenerationType.IDENTITY)
      private long id;
      private String customerName;
      private int customerId;
      private String email;
      private long productId;
}
