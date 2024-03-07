package com.EventScheduler.Event.Scheduler.Repository;

import com.EventScheduler.Event.Scheduler.EventModel.Event;
import org.springframework.data.jpa.repository.JpaRepository;

//implementing CRUD operations
public interface EventRepository extends JpaRepository<Event,Long> {
}
