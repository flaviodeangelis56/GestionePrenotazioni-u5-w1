package flaviodeangelis.GestionePrenotazioniu5w1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Random;

@Entity
@Table(name = "reservations")
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    private long id;
    private LocalDate dayOfReservation;
    private LocalDate dayEndReservation;
    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private Station station;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Reservation(LocalDate dayOfReservation) {
        this.id = new Random().nextLong(1000000000000L, 10000000000000L);
        this.dayOfReservation = dayOfReservation;
        this.dayEndReservation = dayOfReservation.plusDays(1);
    }
}
