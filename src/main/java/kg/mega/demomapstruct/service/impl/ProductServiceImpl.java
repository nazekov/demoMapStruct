package kg.mega.demomapstruct.service.impl;

import kg.mega.demomapstruct.mapper.ProductMapper;
import kg.mega.demomapstruct.model.Product;
import kg.mega.demomapstruct.repository.ProductRepo;
import kg.mega.demomapstruct.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<String> findMakersByType(String type) {
        List<Product> products = productRepo.findAllByType(type);
        return ProductMapper.INSTANCE
                .getMakersList(products)
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findMakersMadeOnlyPcAndNotMadeLaptops(String type1,
                                                              String type2) {
        List<String> makers1 = findMakersByType(type1);
        List<String> makers2 = findMakersByType(type2);
        makers1.removeAll(makers2);
        return makers1;
    }
}
