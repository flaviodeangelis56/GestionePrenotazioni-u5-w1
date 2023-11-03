package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IReservationDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.ReservationRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.Reservation;
import flaviodeangelis.GestionePrenotazioniu5w1.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReservationService implements IReservationDAO {

    @Autowired
    private ReservationRepository reservationRepo;

    @Override
    public void save(Reservation reservation) {
        reservationRepo.save(reservation);
        log.info("la prenotazione con id : " + reservation.getId() + "è stata salvata correttamente!");
    }

    @Override
    public void findByIdAndUpdate(long id, Reservation reservation) {
        Reservation found = this.findById(id);
        found.setUser(reservation.getUser());
        found.setDayOfReservation(reservation.getDayOfReservation());
        found.setStation(reservation.getStation());
        reservationRepo.save(found);
        log.info("Prenotazione con id " + id + " aggiornata con successo!");
    }

    @Override
    public void findByIdAndDelete(long id) {
        Reservation found = this.findById(id);
        reservationRepo.delete(found);
        log.info("Prenotazione con id " + id + " eliminata con successo!");
    }

    @Override
    public Reservation findById(long id) {
        return reservationRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepo.findAll();
    }
}
