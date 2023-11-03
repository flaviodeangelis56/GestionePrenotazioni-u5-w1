package flaviodeangelis.GestionePrenotazioniu5w1.IDAO;

import flaviodeangelis.GestionePrenotazioniu5w1.entities.User;

import java.util.List;

public interface IUserDAO {
    public void save(User user);

    public void findByIdAndUpdate(long id, User user);

    public void findByIdAndDelete(long id);

    public User findById(long id);

    public List<User> findAll();
}
