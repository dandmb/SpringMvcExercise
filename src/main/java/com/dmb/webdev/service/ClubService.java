package com.dmb.webdev.service;


import com.dmb.webdev.dto.ClubDto;
import com.dmb.webdev.dto.EventDto;
import com.dmb.webdev.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto>findAllClubs();
    Club saveClub(ClubDto club);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);
    List<ClubDto> searchClubs(String query);

    interface EventService {
        void createEvent(Long clubId, EventDto eventDto);
        List<EventDto> findAllEvents();
        EventDto findByEventId(Long eventId);
        void updateEvent(EventDto eventDto);
        void deleteEvent(long eventId);
    }
}
