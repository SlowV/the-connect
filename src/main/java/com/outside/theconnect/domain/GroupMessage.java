package com.outside.theconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "group_message")
public class GroupMessage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Group group;
    @Lob
    private String content;
    @ManyToOne
    private User sender;
    @CreationTimestamp
    private Instant createdAt;
}
