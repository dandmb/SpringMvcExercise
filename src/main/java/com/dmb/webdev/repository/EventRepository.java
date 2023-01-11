package com.dmb.webdev.repository;

import com.dmb.webdev.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {


}
