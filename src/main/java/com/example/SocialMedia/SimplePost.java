package com.example.SocialMedia;

public class SimplePost implements Post {

    String message;

    @Override
    public void setMessage(String msg) {

        this.message=msg;
    }

    @Override
    public String getMessage() {
        return this.message;

    }

}
