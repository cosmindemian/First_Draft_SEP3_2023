package sep4.via.delivery_app.model.location;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sep4.via.delivery_app.model.Customer;
import sep4.via.delivery_app.model.PickupPoint;

@Entity
@Setter
@Getter
@Table(schema = "delivery_app")
public class Address
{
  @Id
  @GeneratedValue
  private Long id;
  private String street;
  private Short number;

  @ManyToOne
  @JoinColumn(name = "city_id")
  private City city;

  @OneToOne(mappedBy = "address")
  private PickupPoint pickupPoint;
}
