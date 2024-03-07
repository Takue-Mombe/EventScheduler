package com.EventScheduler.Event.Scheduler.Controller;
import java.util.List;
import com.EventScheduler.Event.Scheduler.EventModel.Event;
import com.EventScheduler.Event.Scheduler.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired(required = true)
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventService.getEventById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id: " + id));
    }

    @Secured("ROLE_USER")
    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        Event createdEvent = eventService.createEvent(event);
        System.out.println("Event created successfully with ID: " + createdEvent.getId());
        return createdEvent;
    }


    @Secured("ROLE_USER")
    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent) {
        Event event = eventService.updateEvent(id, updatedEvent);
        System.out.println("Event updated successfully with ID: " + event.getId());
        return event;
    }

    @Secured("ROLE_USER")
    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
        System.out.println("Event deleted successfully with ID: " + id);
    }
}

