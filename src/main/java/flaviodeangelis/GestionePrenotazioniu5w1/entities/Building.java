package flaviodeangelis.GestionePrenotazioniu5w1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Random;

@Entity
@Table(name = "buildings")
@Getter
@Setter
@NoArgsConstructor
public class Building {
    @Id
    private long id;
    private String name;
    private String address;
    private String city;
    @OneToMany(mappedBy = "building", cascade = CascadeType.REMOVE)
    private List<Station> stations;

    public Building(String name, String address, String city) {
        this.id = new Random().nextLong(1000000000000L, 10000000000000L);
        this.name = name;
        this.address = address;
        this.city = city;
    }
}
