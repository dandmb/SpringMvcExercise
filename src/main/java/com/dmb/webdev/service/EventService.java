package com.dmb.webdev.service;

import com.dmb.webdev.dto.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
    List<EventDto> findAllEvents();
    EventDto findByEventId(Long eventId);
    void updateEvent(EventDto eventDto);
    void deleteEvent(long eventId);
}
