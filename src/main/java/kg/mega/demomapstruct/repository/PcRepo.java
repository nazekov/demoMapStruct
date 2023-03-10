package kg.mega.demomapstruct.repository;

import kg.mega.demomapstruct.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc, Integer> {

    List<Pc> findAllByPriceLessThan(double price);

    List<Pc> findAllByPriceLessThanAndCdIn(double price, List<String> cds);

    @Query(value = "select p from Pc p where p.product.maker = ?1")
    List<Pc> findAllByMaker(String maker);

    List<Pc> findAllBySpeedGreaterThanEqual(int speed);

    @Query("select avg(speed) from Pc")
    Integer calculateAverageSpeed();

    @Query("select avg(speed) from Pc where product.maker = ?1")
    Integer calculateAverageSpeedByMaker(String maker);

    @Query("select hd from Pc " +
            "group by hd " +
            "having count(hd) > 1")
    List<Double> findAllHdByIdenticalTwoOrMorePcs();
}