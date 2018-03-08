package com.chris.socialpage.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ChrisJohnCarter on 3/7/18.
 */

@Entity
public class FriendRequest {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
}
