package com.outside.theconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class District implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    public enum DistrictType{
//       HUYEN(0),QUAN(1),THANH_PHO_TT_TINH(2);
//        private int value;
//
//        DistrictType(int value) {
//            this.value = value;
//        }
//    }
    private String type;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Province province;
    @OneToMany(mappedBy = "district")
    private List<Commune> commune;
}
