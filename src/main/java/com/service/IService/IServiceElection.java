package com.service.IService;

import com.dao.entities.Election;
import java.util.List;

public interface IServiceElection {
        void ajouterElection(Election e);

        List<Election> listerElection();

        void supprimerElection(Integer id);

        void modifierElection(Election e);

        Election rechercherElection(Integer id) throws Exception;
    }
