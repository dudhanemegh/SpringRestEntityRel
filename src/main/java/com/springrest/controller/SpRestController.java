package com.springrest.controller;



import javax.annotation.Resource;



import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.dao.UserDao;
import com.springrest.model.Address;
import com.springrest.model.User;
import com.springrest.model.UserRole;

@RestController
@RequestMapping("/user")
public class SpRestController {
	
	@Resource
    private UserDao userDao;

    @RequestMapping(value="/create", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> post(@RequestBody User user) {
       return new ResponseEntity<User>(userDao.save(user),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> get(@PathVariable int userId) {
       
            return new ResponseEntity<User>(userDao.findOne(userId),HttpStatus.OK);
        
    }
    
    
    
	
	

}
