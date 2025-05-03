package com.example.SocialMedia;

public class SimpleUser implements User {

    String userName;
    PostList postList;

    public void init(){
        System.out.println("DB connected...");
    }

    public void destroy(){
        System.out.println("session closed...");
    }

    @Override
    public void setUserName(String userName) {
        this.userName=userName;

    }

    @Override
    public String getUserName() {
        return this.userName;

    }

    @Override
    public void setPostList(PostList postList) {
        this.postList=postList;

    }

    @Override
    public PostList gePostList() {

        return this.postList;
    }

}
