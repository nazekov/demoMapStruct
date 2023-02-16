package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.dto.LaptopDto;
import java.util.List;

public interface LaptopService {

    List<LaptopDto> findAllByPriceGreaterThan(double price);
}
