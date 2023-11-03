package flaviodeangelis.GestionePrenotazioniu5w1.entities;

import flaviodeangelis.GestionePrenotazioniu5w1.enums.TypeStation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Random;

@Entity
@Table(name = "stations")
@Getter
@Setter
@NoArgsConstructor
public class Station {
    @Id
    private long id;
    private String description;
    private TypeStation stationType;
    private int maxPeopleCapacity;
    @ManyToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;
    private boolean isBooked;
    @OneToMany(mappedBy = "station", cascade = CascadeType.REMOVE)
    private List<Reservation> reservations;

    public Station(String description, TypeStation stationType, int maxPeopleCapacity) {
        this.id = new Random().nextLong(1000000000000L, 10000000000000L);
        this.description = description;
        this.stationType = stationType;
        this.maxPeopleCapacity = maxPeopleCapacity;
        this.isBooked = false;
    }
}
