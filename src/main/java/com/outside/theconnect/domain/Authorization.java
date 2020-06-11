package com.outside.theconnect.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "authorizes")
public class Authorization implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int value;
    @Column(name = "type_name",nullable = false)
    private String typeName;
}
