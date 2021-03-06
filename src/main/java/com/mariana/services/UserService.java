package com.mariana.services;

import com.mariana.DAO.UserDAO;
import com.mariana.DTO.UserMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Maryana on 11.03.2017.
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public String getHello() {
        return "Hello!";
    }

    public UserMessageDTO getModel() {
        String user = userDAO.getUser();
        return new UserMessageDTO(user + " Hi");
    }

}
