package net.jakubpas.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;


@Data
@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private BigDecimal totalPrice;

    private ZonedDateTime createDate;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Account account;

    @JsonManagedReference
    @ManyToMany()
    private List<Product> products;
}
