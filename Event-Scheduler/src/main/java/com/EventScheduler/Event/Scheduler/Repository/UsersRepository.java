package com.EventScheduler.Event.Scheduler.Repository;

import com.EventScheduler.Event.Scheduler.EventModel.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//implementing CRUD operations
public interface UsersRepository extends JpaRepository<Users,String> {
    Optional<Users> findByUsername(String username);
}
