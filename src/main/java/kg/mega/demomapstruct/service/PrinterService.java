package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.dto.PrinterDto;
import kg.mega.demomapstruct.model.dto.PrinterDto18;
import kg.mega.demomapstruct.model.dto.UnionDto;

import java.util.List;

public interface PrinterService {

    List<PrinterDto> findAllByColor(char color);

    List<UnionDto> findAllByMaker(String maker);

    List<UnionDto> findAllByPriceEqualsMax();

    List<PrinterDto18> findAllMakersColorPrinters();
}
