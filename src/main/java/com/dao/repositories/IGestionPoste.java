package com.dao.repositories;

import com.dao.entities.Poste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionPoste extends JpaRepository<Poste,Integer> {
}
