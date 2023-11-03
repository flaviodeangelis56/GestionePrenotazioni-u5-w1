package flaviodeangelis.GestionePrenotazioniu5w1.Runners;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IReservationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReservationRunner implements CommandLineRunner {
    @Autowired
    private IReservationDAO rDAO;

    @Override
    public void run(String... args) throws Exception {

    }
}
