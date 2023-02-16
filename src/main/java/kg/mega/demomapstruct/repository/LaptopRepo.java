package kg.mega.demomapstruct.repository;

import kg.mega.demomapstruct.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

    List<Laptop> findAllByPriceGreaterThan(double price);

    List<Laptop> findAllByHdGreaterThanEqual(double hd);
}
