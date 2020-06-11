package com.outside.theconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "images")
public class Image implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @CreationTimestamp
    private Instant createAt;
    @UpdateTimestamp
    private Instant updateAt;
    private Instant deleteAt;
    private int status;
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
