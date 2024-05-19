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
public class Poste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id_poste;
    String lib_nom_poste;

    public String Lister_poste() {
        return "Poste{" + "id_poste=" + id_poste + ", lib_nom_poste='" + lib_nom_poste + '\'' + '}';
    }
}
