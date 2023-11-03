package flaviodeangelis.GestionePrenotazioniu5w1.IDAO;

import flaviodeangelis.GestionePrenotazioniu5w1.entities.Reservation;

import java.util.List;

public interface IReservationDAO {
    public void save(Reservation reservation);

    public void findByIdAndUpdate(long id, Reservation reservation);

    public void findByIdAndDelete(long id);

    public Reservation findById(long id);

    public List<Reservation> findAll();
}
