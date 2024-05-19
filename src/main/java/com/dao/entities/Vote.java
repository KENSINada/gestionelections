package com.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String lib_poste;
    String lib_num_ident;
    String lib_id_candidat;

    // Méthode  d'inscription
    public void effectuerInscription() {
        System.out.println("Inscription du vote: " + this);
    }
    // Méthode pour effectuer un Vote
    public void effectuerVote() {
        System.out.println("Vote effectué avec succès: " + this);
    }

}
