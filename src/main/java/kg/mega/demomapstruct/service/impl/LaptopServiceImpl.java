package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.mapper.LaptopMapper;
import kg.mega.demomapstruct.model.Laptop;
import kg.mega.demomapstruct.model.dto.*;
import kg.mega.demomapstruct.repository.LaptopRepo;
import kg.mega.demomapstruct.service.LaptopService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepo laptopRepo;

    public LaptopServiceImpl(LaptopRepo laptopRepo) {
        this.laptopRepo = laptopRepo;
    }

    @Override
    public List<LaptopDto> findAllByPriceGreaterThan(double price) {
        List<Laptop> laptops = laptopRepo.findAllByPriceGreaterThan(price);
        return LaptopMapper.INSTANCE.laptopListToListDto(laptops);
    }

    @Override
    public List<LaptopDto6> findAllByHdGreaterThanEqual(double hd) {
        List<Laptop> laptops = laptopRepo.findAllByHdGreaterThanEqual(hd);
        return LaptopMapper.INSTANCE.laptopListToListDto6(laptops);
    }

    @Override
    public List<UnionDto> findAllByMaker(String maker) {
        List<Laptop> laptops = laptopRepo.findAllByMaker(maker);
        return LaptopMapper.INSTANCE.laptopListToListUnionDto(laptops);
    }

    @Override
    public Integer getAverageSpeedByPriceGreaterThan(double price) {
        return laptopRepo.getAverageSpeedByPriceGreaterThan(price);
    }

    @Override
    public List<LaptopDto17> findAllBySpeedLessThanMaxSpeedPc() {
        List<Laptop> laptops = laptopRepo.findAllBySpeedLessThanMaxSpeedPc();
        return LaptopMapper.INSTANCE.laptopListToListDto17(laptops);
    }

    @Override
    public List<Dto19Obj> findAllLaptopsAvgScreen() {
        List<Dto19> dto19s = laptopRepo.findAllMakersByAvgScreen();
        return LaptopMapper.INSTANCE.listdtos19ToDtoImpl19List(dto19s);
    }
}
