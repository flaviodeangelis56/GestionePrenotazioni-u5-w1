package flaviodeangelis.GestionePrenotazioniu5w1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Random;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    private long id;
    private String username;
    private String name;
    private String surname;
    private String email;
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Reservation> userReservations;

    public User(String username, String name, String surname, String email) {
        this.id = new Random().nextLong(1000000000000L, 10000000000000L);
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
