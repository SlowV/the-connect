package com.outside.theconnect.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
@Data
@Entity
@Table(name = "post")
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @Lob
    private String content;
    private String hashTag;
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    private Instant deletedAt;
    private int status;
    @ManyToOne
    private Post post;
    @OneToMany(mappedBy = "post")
    private List<Image> listImg;
    @ManyToOne
    private GroupPost groupPost;
    @OneToOne
    private Authorization authorization;
}
