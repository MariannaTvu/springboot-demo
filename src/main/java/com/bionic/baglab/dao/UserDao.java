package com.bionic.baglab.dao;

import com.bionic.baglab.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;



@Transactional
public interface UserDao extends CrudRepository<UserEntity, Integer> {

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param email the user email.
     */
    public UserEntity findByEmail(String email);


}
/* public String getUser(){
        return UserEntity.user;
    }*/