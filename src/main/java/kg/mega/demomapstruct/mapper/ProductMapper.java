package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Product;
import kg.mega.demomapstruct.model.dto.MakerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "maker", target = "maker")
    MakerDto printerToMakerName(Product product);

    List<MakerDto> printerListToPrinterDto2List(List<Product> products);
}
