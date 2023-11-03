package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IBuildingDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.BuildingRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.Building;
import flaviodeangelis.GestionePrenotazioniu5w1.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BuildingService implements IBuildingDAO {

    @Autowired
    private BuildingRepository buildingRepo;

    @Override
    public void save(Building building) {
        buildingRepo.save(building);
        log.info(" Il palazzo " + building.getName() + " è stato salvato correttamente");
    }

    @Override
    public void findByIdAndUpdate(long id, Building building) {
        Building found = this.findById(id);
        found.setName(building.getName());
        found.setAddress(building.getAddress());
        found.setCity(building.getCity());
        buildingRepo.save(found);
        log.info("Palazzo con id " + id + " aggiornato con successo!");
    }

    @Override
    public void findByIdAndDelete(long id) {
        Building found = this.findById(id);
        buildingRepo.delete(found);
        log.info("Palazzo con id " + id + " eliminato con successo!");
    }

    @Override
    public Building findById(long id) {
        return buildingRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<Building> findAll() {
        return buildingRepo.findAll();
    }
}
