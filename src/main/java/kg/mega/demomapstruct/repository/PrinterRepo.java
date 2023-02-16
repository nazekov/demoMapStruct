package kg.mega.demomapstruct.repository;

import kg.mega.demomapstruct.model.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PrinterRepo extends JpaRepository<Printer, Integer> {

    List<Printer> findAllByColor(char color);
}
