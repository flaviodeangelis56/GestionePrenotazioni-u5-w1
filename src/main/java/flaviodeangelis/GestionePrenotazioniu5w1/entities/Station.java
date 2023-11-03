package flaviodeangelis.GestionePrenotazioniu5w1.entities;

import flaviodeangelis.GestionePrenotazioniu5w1.enums.TypeReservation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Station {
    private long id;
    private String description;
    private TypeReservation reservationType;
    private int maxPeopleCapacity;
    private Building building;
    private boolean isBooked;
}
