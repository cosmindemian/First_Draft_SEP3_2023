package sep4.via.delivery_app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(schema = "delivery_app")
public class PackageStatus
{
  @Id
  @GeneratedValue
  private Long id;
  private String status;

  @OneToMany(mappedBy = "status")
  private Set<Package> packages;
}
