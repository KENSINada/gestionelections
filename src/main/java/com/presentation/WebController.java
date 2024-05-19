package com.presentation;

import com.dao.entities.Utilisateur;
import com.service.IService.IServiceUtilisateur;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Data
public class WebController {
    private IServiceUtilisateur su;

    @GetMapping("/home")
    public String getHome(Model model) {
        List<Utilisateur> listUtilisateur = su.listerUtilisateur();
        model.addAttribute("listUtilisateur", listUtilisateur);
        return "index";
    }

    @GetMapping("/addUtilisateur")
    public String getFormAddUtilisateur(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "AddUtilisateurForm";
    }
    @PostMapping("/addUtilisateur")
    public String addUtilisateur(@Validated Utilisateur u,BindingResult br) {
        if(br.hasErrors()) {
            return "AddUtilisateurForm";
        }
        else {
            su.ajouterUtilisateur(u);
            return "redirect:/home" ;
        }
    }
    @GetMapping("/modifier/{id}")
    public String update(@PathVariable Integer id, Model model) throws Exception {
        Utilisateur utilisateur = su.rechercherUtilisateur(id);
        model.addAttribute("Utilisateur", utilisateur);
        return "UpdateUtilisateurForm";
    }
    @PostMapping("/modifier/{id}")
    public String updateUtilisateur(@PathVariable Long id, @Validated Utilisateur u, BindingResult br) {
        if (br.hasErrors()) {
            return "UpdateUtilisateurtForm";
        } else {
            su.modifierUtilisateur(u);
            return "redirect:/home";
        }
    }
    @GetMapping("/supprimer/{id}")
    public String delete(@PathVariable Integer id, Model model) throws Exception {
        su.supprimerUtilisateur(id);
        return "redirect:/home";

    }
}


