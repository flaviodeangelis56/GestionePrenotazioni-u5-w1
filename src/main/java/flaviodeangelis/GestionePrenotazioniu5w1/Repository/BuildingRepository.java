package flaviodeangelis.GestionePrenotazioniu5w1.Repository;

import flaviodeangelis.GestionePrenotazioniu5w1.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {
}
