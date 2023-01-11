package com.dmb.webdev.service;


import com.dmb.webdev.dto.ClubDto;
import com.dmb.webdev.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto>findAllClubs();
    Club saveClub(Club club);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);
}
