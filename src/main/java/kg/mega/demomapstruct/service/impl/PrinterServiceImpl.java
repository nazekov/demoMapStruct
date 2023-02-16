package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.mapper.PrinterMapper;
import kg.mega.demomapstruct.model.Printer;
import kg.mega.demomapstruct.model.dto.PrinterDto;
import kg.mega.demomapstruct.repository.PrinterRepo;
import kg.mega.demomapstruct.service.PrinterService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrinterServiceImpl implements PrinterService {

    private final PrinterRepo printerRepo;

    public PrinterServiceImpl(PrinterRepo printerRepo) {
        this.printerRepo = printerRepo;
    }

    @Override
    public List<PrinterDto> findAllByColor(char color) {
        List<Printer> printers = printerRepo.findAllByColor(color);
        return PrinterMapper.INSTANCE.printerListToDtoList(printers);
    }
}