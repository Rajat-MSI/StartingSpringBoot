package com.project.startingspringboot;

import com.project.startingspringboot.dao.UserRepository;
import com.project.startingspringboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class StartingSpringBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StartingSpringBootApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);
//        User user1 = new User();
//        user1.setUserId("rajat_123");
//        user1.setUserName("Rajat Sharma");
//        user1.setUserAddress("Rajat's home address");
//        user1.setUserStatus("Online");

//        User user2 = new User();
//        user2.setUserId("simpi_2020");
//        user2.setUserName("Simpi Kumari");
//        user2.setUserAddress("Simpi's home address");
//        user2.setUserStatus("Offline");
//
//        //saving multiple users or entities as lists
//        List<User> userList = List.of(user1,user2);
//        Iterable<User> users = userRepository.saveAll(userList);
//        users.forEach(user ->
//        {
//            System.out.println(user);
//        });

//        userRepository.save(user1);
//        System.out.println(user1);

        //updating user details

//        Optional<User> optionalUser = userRepository.findById("rajat_123");
//        if(optionalUser.isPresent())
//        {
//            User user = optionalUser.get();
//            user.setUserStatus("Online");
//            userRepository.save(user);
//            System.out.println("Status updated");
//        }

//        reading entities
//        Iterable<User> userIterable = userRepository.findAll();
//        for(User user : userIterable)
//        {
//            System.out.println(user);
//        }
//        userIterable.forEach(user ->
//        {
//            System.out.println(user);
//        });

        //deleting entities
//        userRepository.deleteById("rajat_123");
//        System.out.println("deleted");
//        Iterable<User> userIterable = userRepository.findAll();
//        userIterable.forEach(user ->
//        {
//            System.out.println(user);
//        });
//        userRepository.deleteAll(userIterable);
//        System.out.println("Every entity deleted");

//        custom queries
//        Iterable<User> userIterable = userRepository.findUserByUserStatus("Offline");
//        userIterable.forEach(user -> System.out.println(user));

//        JPQL queries
//        User rajat_123 = userRepository.getUserById("rajat_123");
//        System.out.println(rajat_123);

//        native queries
//        Iterable<User> userIterable = userRepository.getUsers();
//        userIterable.forEach(user -> System.out.println(user));
    }

}
