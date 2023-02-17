package kg.mega.demomapstruct.model.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UnionDto {

    String model;

    Double price;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UnionDto unionDto = (UnionDto) o;
//        return Objects.equals(model, unionDto.model)
//                && Objects.equals(price, unionDto.price);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(model, price);
//    }
}
