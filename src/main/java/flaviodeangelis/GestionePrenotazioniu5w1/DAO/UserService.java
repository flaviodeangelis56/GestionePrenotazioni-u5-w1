package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IUserDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.UserRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserDAO {

    @Autowired
    private UserRepository userRepo;

    @Override
    public void save(User user) {

    }

    @Override
    public void findByIdAndUpdate(long id, User user) {

    }

    @Override
    public void findByIdAndDelete(long id) {

    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
