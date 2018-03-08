package com.chris.socialpage.business.service;


import com.chris.socialpage.data.entity.User;
import com.chris.socialpage.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean doesUserWithEmailExist(String email){
       /* User user = userRepository.findByEmailAddress(email);
        if(user != null) {
            return false;
        }
        */
        return false;

    }

    public void saveUser(User user){
        userRepository.save(user);
    }
    public void deleteUser(User user){
        userRepository.delete(user);
    }
    public Iterable<User> findAll() {return userRepository.findAll(); }

}
