package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.dto.LaptopDto;
import kg.mega.demomapstruct.model.dto.LaptopDto6;

import java.util.List;

public interface LaptopService {

    List<LaptopDto> findAllByPriceGreaterThan(double price);

    List<LaptopDto6> findAllByHdGreaterThanEqual(double hd);
}
