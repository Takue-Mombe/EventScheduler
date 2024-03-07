package com.EventScheduler.Event.Scheduler.EventModel;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Setter
@Getter
@Entity
public class Users {

    @Id
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    private int phoneNumber;
    private String emailAddress;

}