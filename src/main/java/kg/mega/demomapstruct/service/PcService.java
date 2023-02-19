package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.dto.PcDto;
import kg.mega.demomapstruct.model.dto.UnionDto;
import java.util.List;

public interface PcService {

    List<PcDto> findByPrice(double price);

    List<PcDto> findAllByPriceLessThanAndCdIn(double price, List<String> cds);

    List<UnionDto> findAllByMaker(String maker);

    List<String> findAllPcMakersBySpeedGreaterThanEqual(int speed);

    Integer calculateAverageSpeed();

    Integer calculateAverageSpeedByMaker(String maker);

    List<Double> findAllHdByIdenticalTwoOrMorePcs();
}
