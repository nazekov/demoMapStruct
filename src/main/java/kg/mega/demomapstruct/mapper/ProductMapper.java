package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Product;
import kg.mega.demomapstruct.model.dto.IProductDto20;
import kg.mega.demomapstruct.model.dto.ProductDto20;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    default String productToMaker(Product product) {
        return product.getMaker();
    }

    ProductDto20 idto20ToDto20Obj(IProductDto20 idto20);

    List<String> getMakersList(List<Product> makers);

    List<ProductDto20> idto20ListToListDto20Obj(List<IProductDto20> idto20List);
}
