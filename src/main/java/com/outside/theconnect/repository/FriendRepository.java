package com.outside.theconnect.repository;

import com.outside.theconnect.domain.Friend;
import com.outside.theconnect.domain.composite.FriendId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, FriendId> {
}
