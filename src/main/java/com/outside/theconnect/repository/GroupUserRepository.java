package com.outside.theconnect.repository;

import com.outside.theconnect.domain.GroupUser;
import com.outside.theconnect.domain.composite.GroupUserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupUserRepository extends JpaRepository<GroupUser, GroupUserId> {
}
