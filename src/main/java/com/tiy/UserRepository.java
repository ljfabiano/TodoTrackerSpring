package com.tiy;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by jfabiano on 9/15/2016.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}
