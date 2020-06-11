package com.outside.theconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Province implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany(mappedBy = "province")
    private Set<District> districts;
//    public enum ProvinceType{
//        TINH(0),THANH_PHO_TRUNG_UONG(1);
//        private int value;
//
//        ProvinceType(int value) {
//            this.value = value;
//        }
//    }
    private String type;

    @ManyToOne(cascade = CascadeType.ALL)
    private Country country;
}
