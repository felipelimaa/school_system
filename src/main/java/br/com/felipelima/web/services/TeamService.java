package br.com.felipelima.web.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.felipelima.web.models.Team;
import br.com.felipelima.web.repository.TeamRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository teamRepository;

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Team save(Team team){
        return teamRepository.save(team);
    }
}
