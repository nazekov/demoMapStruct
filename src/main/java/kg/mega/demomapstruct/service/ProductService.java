package kg.mega.demomapstruct.service;

import java.util.List;

public interface ProductService {

    List<String> findMakersByType(String type);

    List<String> findMakersMadeOnlyPcAndNotMadeLaptops(String type1,
                                                       String type2);
}
