package com.greatLearning.employeeService.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.greatLearning.employeeService.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    public User getUserByUsername(String username);
}