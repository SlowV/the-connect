package com.outside.theconnect.domain;

import com.outside.theconnect.domain.composite.GroupUserId;
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
@Table(name = "group_user")
public class GroupUser implements Serializable {
    @EmbeddedId
    private GroupUserId id;
    @CreationTimestamp
    private Instant dateJoin;
}
