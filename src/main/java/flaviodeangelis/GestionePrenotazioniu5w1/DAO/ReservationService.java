package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IReservationDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.ReservationRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationDAO {

    @Autowired
    private ReservationRepository reservationRepo;

    @Override
    public void save(Reservation reservation) {

    }

    @Override
    public void findByIdAndUpdate(long id, Reservation reservation) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Reservation findById(long id) {
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        return null;
    }
}
