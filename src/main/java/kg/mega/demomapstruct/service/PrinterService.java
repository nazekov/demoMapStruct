package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.Printer;
import kg.mega.demomapstruct.model.dto.PrinterDto;

import java.util.List;

public interface PrinterService {

    List<PrinterDto> findAllByColor(char color);
}
