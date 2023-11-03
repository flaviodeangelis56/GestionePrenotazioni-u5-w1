package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IStationDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.StationRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.Station;
import flaviodeangelis.GestionePrenotazioniu5w1.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StationService implements IStationDAO {

    @Autowired
    private StationRepository stationRepo;

    @Override
    public void save(Station station) {
        stationRepo.save(station);
        log.info("la stanza con id : " + station.getId() + "è stata salvata correttamente!");
    }

    @Override
    public void findByIdAndUpdate(long id, Station station) {
        Station found = this.findById(id);
        found.setBooked(station.isBooked());
        found.setDescription(station.getDescription());
        found.setBuilding(station.getBuilding());
        found.setMaxPeopleCapacity(station.getMaxPeopleCapacity());
        found.setStationType(station.getStationType());
        stationRepo.save(found);
        log.info("Stanza con id " + id + " aggiornata con successo!");
    }

    @Override
    public void findByIdAndDelete(long id) {
        Station found = this.findById(id);
        stationRepo.delete(found);
        log.info("Stanza con id " + id + " eliminata con successo!");
    }

    @Override
    public Station findById(long id) {
        return stationRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Station> findAll() {

        return stationRepo.findAll();
    }
}
