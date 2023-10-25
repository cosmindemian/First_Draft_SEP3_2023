package sep4.via.delivery_app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "delivery_app")
public class Package {

    @Id
    @GeneratedValue
    private Long id;
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Customer sender;


}
