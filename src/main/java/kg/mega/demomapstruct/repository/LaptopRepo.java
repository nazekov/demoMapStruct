package kg.mega.demomapstruct.repository;

import kg.mega.demomapstruct.model.Laptop;
import kg.mega.demomapstruct.model.dto.Dto19;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

    List<Laptop> findAllByPriceGreaterThan(double price);

    List<Laptop> findAllByHdGreaterThanEqual(double hd);

    @Query(value = "select l from Laptop l where l.product.maker = ?1")
    List<Laptop> findAllByMaker(String maker);

    @Query("select avg(speed) from Laptop where price > ?1")
    Integer getAverageSpeedByPriceGreaterThan(double price);

    @Query("select l from Laptop l " +
            "where l.speed < (select min(speed) from Pc)")
    List<Laptop> findAllBySpeedLessThanMaxSpeedPc();

    @Query(value = "select p.maker, avg(l.screen) as screen " +
                    "from laptops as l " +
                    "join products as p on p.model = l.model " +
                    "group by p.maker ",
            nativeQuery = true)
    List<Dto19> findAllMakersByAvgScreen();
}
