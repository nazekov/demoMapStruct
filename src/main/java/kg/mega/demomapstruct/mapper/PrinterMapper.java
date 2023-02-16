package kg.mega.demomapstruct.mapper;

import kg.mega.demomapstruct.model.Printer;
import kg.mega.demomapstruct.model.dto.PrinterDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PrinterMapper {

    PrinterMapper INSTANCE = Mappers.getMapper(PrinterMapper.class);

    @Mapping(source = "product.model", target = "model")
    PrinterDto printerToDto(Printer printer);

    List<PrinterDto> printerListToDtoList(List<Printer> printers);
}
