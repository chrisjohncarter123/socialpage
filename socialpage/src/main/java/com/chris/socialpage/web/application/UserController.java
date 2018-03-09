package com.chris.socialpage.web.application;


import com.chris.socialpage.business.service.UserService;
import com.chris.socialpage.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;


@Controller
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping(path="/postadd")
    @ResponseBody
    public String createNewUser(@RequestBody String user) {

        //@ResponseBody means the return value is a response value, not a view name
        //@RequestParam means the value is from the GET or POST request

        //ResponseEntiry<String>

        return "saved" + user;

        /*
        if(userService.doesUserWithEmailExist(email)){
            return "Error: Email Exists";
        }
        else {
            User n = new User();
            n.setName(name);
            n.setEmail(email);
            n.setPassword(password);
            userService.saveUser(n);
            return "Saved";
        }
        */
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users

        return userService.findAll();
    }


}
