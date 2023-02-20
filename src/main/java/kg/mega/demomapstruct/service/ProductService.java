package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.dto.ProductDto20;

import java.util.List;

public interface ProductService {

    List<String> findMakersByType(String type);

    List<String> findMakersMadeOnlyPcAndNotMadeLaptops(String type1,
                                                       String type2);

    List<ProductDto20> findAllMakersByDistinctCountModels();
}
