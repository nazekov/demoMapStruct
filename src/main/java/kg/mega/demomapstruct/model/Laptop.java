package kg.mega.demomapstruct.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "laptops")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Laptop {

    @Id
    Integer code;

    Integer speed;

    Integer ram;

    Double hd;

    Double price;

    Integer screen;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
}
