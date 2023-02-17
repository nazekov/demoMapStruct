package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.model.dto.UnionDto;
import kg.mega.demomapstruct.service.LaptopService;
import kg.mega.demomapstruct.service.PcService;
import kg.mega.demomapstruct.service.PrinterService;
import kg.mega.demomapstruct.service.ProductService;
import kg.mega.demomapstruct.service.TaskService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TaskServiceImpl implements TaskService {

    private final PcService pcService;
    private final ProductService productService;
    private final LaptopService laptopService;
    private final PrinterService printerService;
    private static HashMap<Integer, Object> map;

    public TaskServiceImpl(PcService pcService,
                           ProductService productService,
                           LaptopService laptopService,
                           PrinterService printerService) {
        this.pcService = pcService;
        this.productService = productService;
        this.laptopService = laptopService;
        this.printerService = printerService;
        initilization();
    }

    @Override
    public Object run(int taskNum) {
        return map.get(taskNum);
    }

    @Override
    public List<UnionDto> findAllProductsByMaker(String maker) {
        return Stream.of(
                    pcService.findAllByMaker(maker),
                    laptopService.findAllByMaker(maker),
                    printerService.findAllByMaker(maker)
                ).flatMap(unionDtos -> unionDtos.stream())
                        .distinct()
                        .collect(Collectors.toList());
    }

    private void initilization() {
        map = new HashMap<>();
        map.put(1, pcService.findByPrice(500));
        map.put(2, productService.findMakersByType("Printer"));
        map.put(3, laptopService.findAllByPriceGreaterThan(1000));
        map.put(4, printerService.findAllByColor('y'));
        map.put(5, pcService.findAllByPriceLessThanAndCdIn(600, List.of("12x", "24x")));
        map.put(6, laptopService.findAllByHdGreaterThanEqual(10));
        map.put(7, findAllProductsByMaker("B"));
    }
}
