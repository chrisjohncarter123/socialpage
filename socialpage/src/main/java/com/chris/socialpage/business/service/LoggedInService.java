package com.chris.socialpage.business.service;

import com.chris.socialpage.data.entity.LoggedIn;
import com.chris.socialpage.data.entity.User;
import com.chris.socialpage.data.repository.LoggedInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ChrisJohnCarter on 3/7/18.
 */


@Service
public class LoggedInService {

    @Autowired
    LoggedInRepository loggedInRepository;

    /*
    public boolean isLoggedIn(User user){

    }
    */

    public void loginUser(User user){
       saveLoggedIn(createLoggedInFromUser(user));
    }
    /*
    public void logoutUser(User user){

    }
    */
    public LoggedIn createLoggedInFromUser(User user) {
        LoggedIn loggedIn = new LoggedIn();
        loggedIn.setUserId(user.getId());
        loggedInRepository.save(loggedIn);
        return loggedIn;
    }
    public void saveLoggedIn(LoggedIn loggedIn) {
        loggedInRepository.save(loggedIn);
    }
    public void deleteLoggedIn(LoggedIn loggedIn) {
        loggedInRepository.delete(loggedIn);
    }

}
