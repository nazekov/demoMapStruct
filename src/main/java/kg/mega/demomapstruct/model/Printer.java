package kg.mega.demomapstruct.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "printers")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Printer {

    @Id
    Integer code;

    @Column(length = 1)
    Character color;

    @Column(length = 10)
    String type;

    Double price;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
}
