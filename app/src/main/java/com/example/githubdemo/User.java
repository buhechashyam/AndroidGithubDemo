package com.example.githubdemo;

import java.io.Serializable;

public class User implements Serializable {
    String mUserName;
    int mAge;

    public User(String mUserName, int mAge) {
        this.mUserName = mUserName;
        this.mAge = mAge;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }
}
