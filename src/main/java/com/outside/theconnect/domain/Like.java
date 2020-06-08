package com.outside.theconnect.domain;

import com.outside.theconnect.domain.composite.LikeId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "likes")
public class Like implements Serializable {
    @EmbeddedId
    private LikeId id;
    private int type;
}