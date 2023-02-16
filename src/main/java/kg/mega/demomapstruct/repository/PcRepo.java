package kg.mega.demomapstruct.repository;

import kg.mega.demomapstruct.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc, Integer> {

    List<Pc> findAllByPriceLessThan(double price);
}
