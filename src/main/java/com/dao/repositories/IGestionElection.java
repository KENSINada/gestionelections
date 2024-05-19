package com.dao.repositories;

import com.dao.entities.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionElection extends JpaRepository<Election,Integer> {

}
