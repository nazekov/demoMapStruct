package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Pc;
import kg.mega.demomapstruct.model.dto.PcDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface PcMapper {

    PcMapper INSTANCE = Mappers.getMapper(PcMapper.class);

    @Mapping(source = "product.model", target = "model")
    PcDto pcToPcDto(Pc pc);

    List<PcDto> pcListToPcDtoList(List<Pc> pcList);
}
