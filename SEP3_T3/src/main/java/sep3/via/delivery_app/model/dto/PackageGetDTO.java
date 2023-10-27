package sep3.via.delivery_app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sep3.via.delivery_app.model.Package;

@Getter
@Setter
@AllArgsConstructor
public class PackageGetDTO {

    private long senderId;
    private double weight;
    private long id;
    private String status;
    private String senderName;
    private String receiverName;
    private AddressGetDTO receiverAddress;

    public PackageGetDTO(Package pac)
    {
        this.id = pac.getId();
        this.weight = pac.getWeight();
        this.senderId = pac.getSender().getId();
        this.status = pac.getStatus().getStatus();
        this.senderName = pac.getSender().getName();
        this.receiverName = pac.getReceiver().getName();
        this.receiverAddress = new AddressGetDTO(pac.getReceiverAddress());
    }
}
