package kg.mega.demomapstruct.repository;

import kg.mega.demomapstruct.model.Product;
import kg.mega.demomapstruct.model.dto.IProductDto20;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findAllByType(String type);

    @Query(value = "select maker, COUNT(model) as countModels " +
                    "from products " +
                    "where type = 'PC' " +
                    "group by maker " +
                    "having COUNT(model) >= 3 ",
            nativeQuery = true)
    List<IProductDto20> findAllMakersByDistinctCountModels();
}
