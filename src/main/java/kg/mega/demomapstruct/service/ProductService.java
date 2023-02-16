package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.dto.MakerDto;
import java.util.List;

public interface ProductService {

    List<String> findMakersByType(String type);
}
