package com.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Election {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     int idElection;
     Date dateDebut;
     Date dateFin;
     //test

}
