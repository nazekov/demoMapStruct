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
}
