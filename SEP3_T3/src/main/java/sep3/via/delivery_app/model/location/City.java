package sep3.via.delivery_app.model.location;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(schema = "delivery_app")
public class City
{
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String zipCode;

  @OneToMany(mappedBy = "city")
  private Set<Address> addresses;


}
