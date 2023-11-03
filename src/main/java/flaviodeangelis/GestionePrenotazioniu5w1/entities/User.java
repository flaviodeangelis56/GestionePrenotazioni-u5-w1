package flaviodeangelis.GestionePrenotazioniu5w1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    private String username;
    private String name;
    private String surname;
    private String email;
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Reservation> userReservations;
}
