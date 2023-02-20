package kg.mega.demomapstruct.model.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto20 {

    String maker;

    Integer countModels;
}
