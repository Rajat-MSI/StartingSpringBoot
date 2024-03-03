package com.project.startingspringboot.service;

import com.project.startingspringboot.dao.UserRepository;
import com.project.startingspringboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user)
    {
        userRepository.save(user);
    }

    public User getUserByUserId(String userId)
    {
        return userRepository.getUserById(userId);
    }

    public List<User> getUserList()
    {
        return userRepository.getUsers();
    }

    public void deleteUser(String userId)
    {
        userRepository.deleteById(userId);
    }

    public void updateUser(String userId, User user)
    {
//        Optional<User> userOptional = userRepository.findById(userId);
//        if(userOptional.isPresent())
//        {
//            User userUpdate = userOptional.get();
//            userUpdate.setUserName(user.getUserName());
//            userUpdate.setUserAddress(user.getUserAddress());
//            userUpdate.setUserStatus(user.getUserStatus());
//            userRepository.save(userUpdate);
//        }
        user.setUserId(userId);
        userRepository.save(user);
    }


}
