package com.kevin.repository;

import com.kevin.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hasee on 2018/3/1.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
