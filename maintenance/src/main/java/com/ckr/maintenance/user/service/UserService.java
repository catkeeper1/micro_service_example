package com.ckr.maintenance.user.service;

import com.ckr.maintenance.user.repository.UserRepository;
import com.ckr.maintenance.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/5/21.
 */
@Service

public class UserService {

    @Autowired
    UserRepository userRepository;
    //UserDao userDao;

    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
