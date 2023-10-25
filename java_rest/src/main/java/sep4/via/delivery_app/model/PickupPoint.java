package sep4.via.delivery_app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sep4.via.delivery_app.model.location.Address;

@Entity
@Getter
@Setter
@Table(schema = "delivery_app")
public class PickupPoint
{
  @Id
  @GeneratedValue
  private Long id;
  private String name;

  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address address;
}
