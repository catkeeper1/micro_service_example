package com.ckr.maintenance.user.repository;

import com.ckr.maintenance.user.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/21.
 */
public interface UserRepository extends CrudRepository<User, String> {
   public List<User> findAll();
   public List<User> findByUserName(String userName);
}
