package com.dmb.webdev.service;


import com.dmb.webdev.dto.ClubDto;
import com.dmb.webdev.models.Club;
import jakarta.validation.Valid;

import java.util.List;

public interface ClubService {
    List<ClubDto>findAllClubs();
    Club saveClub(ClubDto club);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);
}
