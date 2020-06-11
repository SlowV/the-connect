package com.outside.theconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User sender;
    @OneToOne
    private User receiver;

    @OneToMany(mappedBy = "message")
    private List<Chat> chats;
    @OneToMany(mappedBy = "message")
    private List<Image> listImages;
}
