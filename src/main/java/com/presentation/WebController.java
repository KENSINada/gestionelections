package com.presentation;

import com.dao.entities.Utilisateur;
import com.service.IService.IServiceUtilisateur;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
public class WebController {
private final IServiceUtilisateur su;
@GetMapping("/home")
    public String getHome(Model model){
    List<Utilisateur> listUtilisateur = su.listerUtilisateur();
}

}
