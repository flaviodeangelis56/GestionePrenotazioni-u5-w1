package flaviodeangelis.GestionePrenotazioniu5w1.Runners;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IBuildingDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BuildingRunner implements CommandLineRunner {
    @Autowired
    private IBuildingDAO bDAO;

    @Override
    public void run(String... args) throws Exception {
        Building test = new Building("palazzo centrale", "via dei guinceri 23", "roma");
        bDAO.save(test);
    }
}
