package flaviodeangelis.GestionePrenotazioniu5w1.DAO;

import flaviodeangelis.GestionePrenotazioniu5w1.IDAO.IUserDAO;
import flaviodeangelis.GestionePrenotazioniu5w1.Repository.UserRepository;
import flaviodeangelis.GestionePrenotazioniu5w1.entities.User;
import flaviodeangelis.GestionePrenotazioniu5w1.exception.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService implements IUserDAO {

    @Autowired
    private UserRepository userRepo;

    @Override
    public void save(User user) {
        userRepo.save(user);
        log.info(user.getName() + " salvato correttamente!");
    }

    @Override
    public void findByIdAndUpdate(long id, User user) {
        User found = this.findById(id);
        found.setUsername(user.getUsername());
        found.setName(user.getName());
        found.setSurname(user.getSurname());
        found.setEmail(user.getEmail());
        userRepo.save(found);
        log.info("User con id " + id + " aggiornato con successo!");
    }

    @Override
    public void findByIdAndDelete(long id) {
        User found = this.findById(id);
        userRepo.delete(found);
        log.info("User con id " + id + " eliminato con successo!");
    }

    @Override
    public User findById(long id) {
        return userRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
