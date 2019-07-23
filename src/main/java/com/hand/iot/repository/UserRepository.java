package com.hand.iot.repository;

import com.hand.iot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author:ydz
 * @date:$
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	//User:返回的类型；Integer:主键id返类型
}
