package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Pc;
import kg.mega.demomapstruct.model.dto.PcDto;
import kg.mega.demomapstruct.model.dto.UnionDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface PcMapper {

    PcMapper INSTANCE = Mappers.getMapper(PcMapper.class);

    @Mapping(source = "product.model", target = "model")
    PcDto pcToPcDto(Pc pc);

    @Mapping(source = "product.model", target = "model")
    UnionDto pcToUnionDto(Pc pc);

    default String pcToMaker(Pc pc) {
        return pc.getProduct().getMaker();
    }

    List<PcDto> pcListToPcDtoList(List<Pc> pcList);

    List<UnionDto> pcListToListUnionDto(List<Pc> pcList);

    List<String> pcListToMakerList(List<Pc> pcList);
}
