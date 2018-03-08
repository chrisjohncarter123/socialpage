package com.chris.socialpage.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ChrisJohnCarter on 3/7/18.
 */

@Entity
public class LoggedIn {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private long userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
