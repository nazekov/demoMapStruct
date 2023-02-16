package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.mapper.LaptopMapper;
import kg.mega.demomapstruct.model.Laptop;
import kg.mega.demomapstruct.model.dto.LaptopDto;
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
}
