package com.project.startingspringboot.dao;

import com.project.startingspringboot.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String>
{
//    using custom methods
    List<User> findUserByUserStatus(String userStatus);
    List<User> findUserByUserName(String userName);


//    using JPQL
    @Query("select u from User u where u.userId = :userId")
    User getUserById(@Param("userId") String userId);

//    using native sql query
    @Query(value = "select * from user",nativeQuery = true)
    List<User> getUsers();
}
