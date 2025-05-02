package com.example.SocialMedia;

import java.util.ArrayList;
import java.util.List;

public class SimplePostList implements PostList{


    List<Post> listOfPost=null;

    public SimplePostList(){
        this.listOfPost=new ArrayList<Post>();
    }

    @Override
    public void setPost(Post post) {

        listOfPost.add(post);
    }

    @Override
    public List<Post> getPost() {
        return listOfPost;

    }

}
