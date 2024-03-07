package com.EventScheduler.Event.Scheduler.EventModel;


import com.EventScheduler.Event.Scheduler.Repository.UsersRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.time.LocalTime;
import java.util.Collection;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "users")
public class Users implements UserDetails {

    @Getter
    @Id
    private String username;
    @Getter
    private String password;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String emailAddress;


    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Return the user's authorities (roles)
        // Example: return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
        return null;
    }


    public boolean isAccountNonExpired() {
        return true; // Modify as needed
    }


    public boolean isAccountNonLocked() {
        return true; // Modify as needed
    }


    public boolean isCredentialsNonExpired() {
        return true; // Modify as needed
    }


    public boolean isEnabled() {
        return true; // Modify as needed
    }


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
