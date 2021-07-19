package br.com.felipelima.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.felipelima.web.models.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{
    
}
