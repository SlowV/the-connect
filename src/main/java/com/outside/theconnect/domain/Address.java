package com.outside.theconnect.domain;

import lombok.Data;
import org.springframework.context.annotation.PropertySource;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "address")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;

    @ManyToOne
    private Province province;
    @ManyToOne
    private District district;
    @ManyToOne
    private Commune commune;
}
