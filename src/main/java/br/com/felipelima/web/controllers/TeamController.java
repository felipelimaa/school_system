package br.com.felipelima.web.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipelima.web.models.Team;
import br.com.felipelima.web.services.TeamService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/teams")
@AllArgsConstructor
public class TeamController {
    private TeamService teamService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Team> teams = teamService.findAll();
        return ResponseEntity.ok(teams);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Team team){
        Team teamAdded = teamService.save(team);
        return ResponseEntity.status(HttpStatus.CREATED).body(teamAdded);
    }
}
