package com.mariana.DAO;

import com.mariana.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Maryana on 11.03.2017.
 */
@Repository
public class UserDAO {

    public String getUser(){
        return UserEntity.user;
    }

}
