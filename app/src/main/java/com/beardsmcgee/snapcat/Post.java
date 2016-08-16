package com.beardsmcgee.snapcat;

/**
 * Created by beardsmcgee on 8/15/16.
 */
// @Parcel
public class Post {
    private String post;
    private String userId;

    public Post() {}

    public Post(String userId, String post){
        this.post = post;
        this.userId = userId;
    }

    public void setPost(String post){
        this.post = post;
    }

    public String getPost(){
        return post;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }
}
