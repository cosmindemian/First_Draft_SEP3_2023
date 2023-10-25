package sep4.via.delivery_app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sep4.via.delivery_app.model.location.Address;

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

    @ManyToOne
    @JoinColumn(name = "sender_address_id")
    private Address senderAddress;

    @ManyToOne
    @JoinColumn(name = "last_known_address_id")
    private Address lastKnownLocation;

    @ManyToOne
    @JoinColumn(name = "receiver_address_id")
    private Address receiverAddress;
}
