package com.dao.repositories;

import com.dao.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionVote extends JpaRepository<Vote,Integer> {
}
