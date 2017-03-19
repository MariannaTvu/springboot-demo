package com.bionic.baglab.dto;

/**
 * Created by Maryana on 11.03.2017.
 */

public class UserMessageDTO {

    private String message;

    public UserMessageDTO() {
    }

    public UserMessageDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public UserMessageDTO setMessage(String message) {
        this.message = message;
        return this;
    }
}
