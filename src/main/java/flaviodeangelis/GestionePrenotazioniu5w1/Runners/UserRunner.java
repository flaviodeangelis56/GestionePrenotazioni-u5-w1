package flaviodeangelis.GestionePrenotazioniu5w1.Runners;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunner implements CommandLineRunner {
    @Autowired
    private IUserDAO uDAO;

    @Override
    public void run(String... args) throws Exception {

    }
}
