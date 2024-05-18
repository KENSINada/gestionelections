package com.dao.repositories;

import com.dao.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGestionUtilisateur extends JpaRepository<Utilisateur,Integer> {
}
