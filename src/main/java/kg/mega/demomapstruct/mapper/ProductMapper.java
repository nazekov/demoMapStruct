package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    default String productToMaker(Product product) {
        return product.getMaker();
    }

    List<String> getMakersList(List<Product> makers);
}
