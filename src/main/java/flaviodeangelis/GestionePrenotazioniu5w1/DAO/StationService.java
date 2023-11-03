package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IStationDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.StationRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService implements IStationDAO {

    @Autowired
    private StationRepository stationRepo;

    @Override
    public void save(Station station) {

    }

    @Override
    public void findByIdAndUpdate(long id, Station station) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Station findById(long id) {
        return null;
    }

    @Override
    public List<Station> findAll() {
        return null;
    }
}
