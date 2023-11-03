package flaviodeangelis.GestionePrenotazioniu5w1.Runners;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IStationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StationRunner implements CommandLineRunner {
    @Autowired
    private IStationDAO sDAO;

    @Override
    public void run(String... args) throws Exception {

    }
}
