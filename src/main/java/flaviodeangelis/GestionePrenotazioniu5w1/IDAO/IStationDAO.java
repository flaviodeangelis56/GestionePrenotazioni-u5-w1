package flaviodeangelis.GestionePrenotazioniu5w1.IDAO;

import flaviodeangelis.GestionePrenotazioniu5w1.entities.Station;

import java.util.List;

public interface IStationDAO {
    public void save(Station station);

    public void findByIdAndUpdate(long id, Station station);

    public void findByIdAndDelete(long id);

    public Station findById(long id);

    public List<Station> findAll();
}
