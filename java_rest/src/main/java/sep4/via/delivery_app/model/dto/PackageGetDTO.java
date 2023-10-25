package sep4.via.delivery_app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sep4.via.delivery_app.model.Package;

@Getter
@Setter
@AllArgsConstructor
public class PackageGetDTO {

    private long senderId;
    private double weight;
    private long id;

    public PackageGetDTO(Package pac) {
        this.id = pac.getId();
        this.weight = pac.getWeight();
        this.senderId = pac.getSender().getId();
    }

}
