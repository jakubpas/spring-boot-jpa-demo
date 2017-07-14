package net.jakubpas.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	private Long salesForceId;

	@NotEmpty
	private String name;

    @NotEmpty
	private String description;

	@NotNull
	private BigDecimal price;

	@JsonBackReference
	@ManyToMany(mappedBy = "products")
	private List<Order> orders;

    public Product(Integer id, Long salesForceId, String name, String description, BigDecimal price) {
        this.id = id;
        this.salesForceId = salesForceId;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
