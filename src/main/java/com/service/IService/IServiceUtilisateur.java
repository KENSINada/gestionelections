package com.service.IService;

import com.dao.entities.Utilisateur;

import java.util.List;

public interface IServiceUtilisateur {
        public void ajouterUtilisateur(Utilisateur u) ;
        public List<Utilisateur> listerUtilisateur();
        public void supprimerUtilisateur(Integer id);
        public void modifierUtilisateur(Utilisateur u);
        public Utilisateur rechercherUtilisateur(Integer id)throws Exception;

}
