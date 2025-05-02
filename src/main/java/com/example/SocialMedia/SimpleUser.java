package com.example.SocialMedia;

public class SimpleUser implements User {

    String userName;
    PostList postList;

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
