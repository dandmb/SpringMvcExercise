package com.dmb.webdev.service.impl;

import com.dmb.webdev.dto.ClubDto;
import com.dmb.webdev.models.Club;
import com.dmb.webdev.repository.ClubRepository;
import com.dmb.webdev.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ClubServiceImpl implements ClubService {
    @Autowired
    private ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs=clubRepository.findAll();
        return clubs.stream().map(club -> mapToClubDto(club)).collect(Collectors.toList());
    }

    @Override
    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public ClubDto findClubById(long clubId) {
        Club club=clubRepository.findById(clubId).get();
        return mapToClubDto(club);
    }

    @Override
    public void updateClub(ClubDto clubDto) {
        Club club=mapToClub(clubDto);
        clubRepository.save(club);
    }

    private Club mapToClub(ClubDto club) {
        Club cluDto=Club.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatadOn(club.getUpdatadOn())
                .build();
        return cluDto;
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto cluDto=ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatadOn(club.getUpdatadOn())
                .build();
        return cluDto;

    }
}
