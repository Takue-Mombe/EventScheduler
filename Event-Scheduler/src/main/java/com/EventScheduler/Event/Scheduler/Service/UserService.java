package com.EventScheduler.Event.Scheduler.Service;


import com.EventScheduler.Event.Scheduler.EventModel.Users;
import com.EventScheduler.Event.Scheduler.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Users registerUser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return usersRepository.save(user);
    }

    public Optional<Users> findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }
}
