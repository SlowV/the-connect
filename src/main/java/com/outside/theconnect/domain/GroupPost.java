package com.outside.theconnect.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "group_post")
public class GroupPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Group group;
    @OneToMany(mappedBy = "groupPost")
    private Set<Post> post = new HashSet<>();
    @ManyToOne
    private User uploader;
    @CreationTimestamp
    private Instant createdAt;
    @OneToOne
    private Authorization authorization;
}
