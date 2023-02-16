package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.mapper.PcMapper;
import kg.mega.demomapstruct.model.Pc;
import kg.mega.demomapstruct.model.dto.PcDto;
import kg.mega.demomapstruct.repository.PcRepo;
import kg.mega.demomapstruct.service.PcService;
import org.springframework.stereotype.Service;
import java.util.List;

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
}
