package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IBuildingDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.BuildingRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService implements IBuildingDAO {

    @Autowired
    private BuildingRepository buildingRepo;

    @Override
    public void save(Building building) {

    }

    @Override
    public void findByIdAndUpdate(long id, Building building) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public Building findById(long id) {
        return null;
    }

    @Override
    public List<Building> findAll() {
        return null;
    }
}
