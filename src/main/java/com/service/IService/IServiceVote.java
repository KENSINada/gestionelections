package com.service.IService;

import com.dao.entities.Vote;

import java.util.List;

public interface IServiceVote {

        void ajouterVote(Vote v);

        List<Vote> listerVotes();

        void supprimerVote(Integer id);

        void modifierVote(Vote v);

        Vote rechercherVote(Integer id) throws Exception;

}
