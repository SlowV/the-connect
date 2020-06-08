package com.outside.theconnect.domain.composite;
import com.outside.theconnect.domain.Post;
import com.outside.theconnect.domain.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@Getter
@Setter
public class LikeId implements Serializable {
    @OneToOne
    private Post post;
    @OneToOne
    private User user;
}
