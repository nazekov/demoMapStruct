package kg.mega.demomapstruct.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pcs")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pc {

    @Id
    Integer code;

    Integer speed;

    Integer ram;

    Double hd;

    @Column(length = 10)
    String cd;

    Double price;

    @ManyToOne
    @JoinColumn(name = "model")
    Product product;
}
