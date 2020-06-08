package com.outside.theconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Chat implements Serializable {
    @Id
    private Long id;
    @Lob
    private String content;
    @CreationTimestamp
    private Instant timeSend;
    private Instant timeRead;
    @ManyToOne
    private Message message;
}
