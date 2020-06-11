package com.outside.theconnect.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
public class Province implements Serializable {
    @Id
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
    @ManyToOne
    private Country country;
}
