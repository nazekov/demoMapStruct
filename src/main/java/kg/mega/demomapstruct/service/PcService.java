package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.Pc;
import kg.mega.demomapstruct.model.dto.PcDto;
import java.util.List;

public interface PcService {

    List<PcDto> findByPrice(double price);

    List<PcDto> findAllByPriceLessThanAndCdIn(double price, List<String> cds);
}
