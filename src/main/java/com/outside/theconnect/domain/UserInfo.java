package com.outside.theconnect.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@Table(name = "user_info")
@Entity
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(unique = true)
    @OneToOne
    private User user;

    private String firstName;
    private String lastName;
    private int gender;
    private Date dob;
    @OneToOne
    private Image avatar;
    @Lob
    private String introduce;
    @OneToOne
    private Address address;
}
