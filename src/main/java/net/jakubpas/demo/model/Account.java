package net.jakubpas.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ecoId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String country;
    private String zip;
    private String city;

    @JsonBackReference
    @OneToOne(mappedBy = "account")
    private Order order;
}
