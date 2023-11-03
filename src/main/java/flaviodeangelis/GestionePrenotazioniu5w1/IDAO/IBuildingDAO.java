package flaviodeangelis.GestionePrenotazioniu5w1.IDAO;

import flaviodeangelis.GestionePrenotazioniu5w1.entities.Building;

import java.util.List;

public interface IBuildingDAO {
    public void save(Building building);

    public void findByIdAndUpdate(long id, Building building);

    public void findByIdAndDelete(long id);

    public Building findById(long id);

    public List<Building> findAll();
}
