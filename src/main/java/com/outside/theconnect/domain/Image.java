package com.outside.theconnect.domain;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @CreationTimestamp
    private Instant createAt;
    private Instant updateAt;
    private Instant deleteAt;
    private boolean status;
    @ManyToOne
    private User user;
    @ManyToOne
    private Post post;
    @OneToOne
    private Group group;
    @ManyToOne
    private Chat chats;
    @ManyToOne
    private Message message;
    @OneToOne(mappedBy = "avatar")
    private UserInfo userInfo;
}
