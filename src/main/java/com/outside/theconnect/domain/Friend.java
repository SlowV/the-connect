package com.outside.theconnect.domain;

import com.outside.theconnect.domain.composite.FriendId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "friend")
@NoArgsConstructor
@AllArgsConstructor
public class Friend implements Serializable {
    @EmbeddedId
    private FriendId id;
    public enum FriendType{
        IsFriend(1),Following(2),Blocked(3);
        private int value;

        FriendType(int value) {
            this.value = value;
        }
    }
    private int type;
}
