package com.outside.theconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "groupss")
@AllArgsConstructor
@NoArgsConstructor
public class Group implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int status;
    private int type;
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    private Instant deletedAt;
    @ManyToOne
    private User creator;
    @OneToOne(mappedBy = "group")
    private Image groupAvatar;
    @OneToMany(mappedBy = "group")
    private Set<GroupMessage> groupMessage = new HashSet<>();
    @OneToMany(mappedBy = "group")
    private Set<GroupPost> groupPosts = new HashSet<>();
}
