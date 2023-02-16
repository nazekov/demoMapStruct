package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Laptop;
import kg.mega.demomapstruct.model.dto.LaptopDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface LaptopMapper {

    LaptopMapper INSTANCE = Mappers.getMapper(LaptopMapper.class);

    @Mapping(source = "product.model", target = "model")
    LaptopDto laptopToDto(Laptop laptop);

    List<LaptopDto> laptopListToListDto(List<Laptop> laptops);
}
