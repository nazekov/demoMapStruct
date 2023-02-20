package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Laptop;
import kg.mega.demomapstruct.model.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface LaptopMapper {

    LaptopMapper INSTANCE = Mappers.getMapper(LaptopMapper.class);

    @Mapping(source = "product.model", target = "model")
    LaptopDto laptopToDto(Laptop laptop);

    @Mapping(source = "product.maker", target = "maker")
    LaptopDto6 laptopToDto6(Laptop laptop);

    @Mapping(source = "product.model", target = "model")
    UnionDto laptopToUnionDto(Laptop laptop);

    Dto19Obj dto19ToDtoImpl19(Dto19 dto19);

    @Mapping(source = "product.type", target = "type")
    @Mapping(source = "product.model", target = "model")
    LaptopDto17 laptopToDto17(Laptop laptop);

    List<LaptopDto> laptopListToListDto(List<Laptop> laptops);

    List<LaptopDto6> laptopListToListDto6(List<Laptop> laptops);

    List<UnionDto> laptopListToListUnionDto(List<Laptop> laptops);

    List<LaptopDto17> laptopListToListDto17(List<Laptop> laptops);

    List<Dto19Obj> listdtos19ToDtoImpl19List(List<Dto19> dto19s);
}
