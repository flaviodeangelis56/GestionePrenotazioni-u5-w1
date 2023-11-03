package flaviodeangelis.GestionePrenotazioniu5w1.Repository;

import flaviodeangelis.GestionePrenotazioniu5w1.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
