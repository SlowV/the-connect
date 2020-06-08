package com.outside.theconnect.domain.composite;

import com.outside.theconnect.domain.Group;
import com.outside.theconnect.domain.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@Getter
@Setter
public class GroupUserId implements Serializable {
    @OneToOne
    private Group group;
    @OneToOne
    private User user;
}
