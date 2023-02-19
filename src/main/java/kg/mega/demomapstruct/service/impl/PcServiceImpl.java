package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.mapper.PcMapper;
import kg.mega.demomapstruct.model.Pc;
import kg.mega.demomapstruct.model.dto.PcDto;
import kg.mega.demomapstruct.model.dto.UnionDto;
import kg.mega.demomapstruct.repository.PcRepo;
import kg.mega.demomapstruct.service.PcService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PcServiceImpl implements PcService {

    private final PcRepo pcRepo;

    public PcServiceImpl(PcRepo pcRepo) {
        this.pcRepo = pcRepo;
    }

    @Override
    public List<PcDto> findByPrice(double price) {
        List<Pc> pcList = pcRepo.findAllByPriceLessThan(price);
        return PcMapper.INSTANCE.pcListToPcDtoList(pcList);
    }

    @Override
    public List<PcDto> findAllByPriceLessThanAndCdIn(double price,
                                                     List<String> cds) {
        List<Pc> pcList = pcRepo.findAllByPriceLessThanAndCdIn(price, cds);
        return PcMapper.INSTANCE.pcListToPcDtoList(pcList);
    }

    @Override
    public List<UnionDto> findAllByMaker(String maker) {
        List<Pc> pcList = pcRepo.findAllByMaker(maker);
        return PcMapper.INSTANCE.pcListToListUnionDto(pcList);
    }

    @Override
    public List<String> findAllPcMakersBySpeedGreaterThanEqual(int speed) {
        List<Pc> pcList = pcRepo.findAllBySpeedGreaterThanEqual(speed);
        return PcMapper.INSTANCE.pcListToMakerList(pcList)
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public Integer calculateAverageSpeed() {
        return pcRepo.calculateAverageSpeed();
    }

    @Override
    public Integer calculateAverageSpeedByMaker(String maker) {
        return pcRepo.calculateAverageSpeedByMaker(maker);
    }

    @Override
    public List<Double> findAllHdByIdenticalTwoOrMorePcs() {
        return pcRepo.findAllHdByIdenticalTwoOrMorePcs();
    }
}
