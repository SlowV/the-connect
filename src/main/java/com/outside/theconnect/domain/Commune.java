package com.outside.theconnect.domain;

import com.outside.theconnect.domain.District;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "commune")
public class Commune {
    @Id
    private Long id;
    private String name;
//    public enum CommuneType{
//        Xa(0),PHUONG(2),THI_TRAN(1);
//        private  int value;
//
//        CommuneType(int value) {
//            this.value = value;
//        }
//    }
    private String communeType;
    @ManyToOne
    private District district;
}
