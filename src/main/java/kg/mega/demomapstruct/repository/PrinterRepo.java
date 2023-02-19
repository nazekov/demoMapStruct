package kg.mega.demomapstruct.repository;

import kg.mega.demomapstruct.model.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Integer> {

    List<Printer> findAllByColor(char color);

    @Query(value = "select p from Printer p where p.product.maker = ?1")
    List<Printer> findAllByMaker(String maker);

    @Query("select p from Printer p " +
            "where p.price = (select max(price) from Printer)")
    List<Printer> findAllByPriceEqualsMax();

    @Query("select pr from Printer pr " +
            "where pr.color = 'y' and pr.price = (" +
                "select min(price) from Printer " +
                "where color = 'y'" +
            ")")
    List<Printer> findAllColorPrinters();
}
