package com.service.IService;

import com.dao.entities.Poste;

import java.util.List;

public interface IServicePoste {

    void ajouterPoste(Poste p);

    List<Poste> listerPostes();

    void supprimerPoste(Integer id);

    void modifierPoste(Poste p);

    Poste rechercherPoste(Integer id) throws Exception;

}
