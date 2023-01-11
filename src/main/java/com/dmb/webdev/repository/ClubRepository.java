package com.dmb.webdev.repository;

import com.dmb.webdev.models.Club;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
    @Query("SELECT c from Club c where c.title like concat('%',:query,'%') ")
    List<Club> searchClubs(String query);
}
