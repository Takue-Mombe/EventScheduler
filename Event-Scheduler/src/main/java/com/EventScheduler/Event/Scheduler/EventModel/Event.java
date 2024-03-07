package com.EventScheduler.Event.Scheduler.EventModel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Date;

@Setter
@Getter
@Entity(name = "postgres")
@Table(name = "")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title;
    private String Description;
    private Date Date;
    private LocalTime time;

}
