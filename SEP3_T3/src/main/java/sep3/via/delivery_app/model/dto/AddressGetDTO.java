package sep3.via.delivery_app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sep3.via.delivery_app.model.location.Address;

@Getter
@Setter
@AllArgsConstructor
public class AddressGetDTO
{
  private long id;
  private String street;
  private String city;
  private short number;
  private String zipCode;

  public AddressGetDTO(Address address)
  {
    this.id = address.getId();
    this.street = address.getStreet();
    this.city = address.getCity().getName();
    this.number = address.getNumber();
    this.zipCode = address.getCity().getZipCode();
  }
}
