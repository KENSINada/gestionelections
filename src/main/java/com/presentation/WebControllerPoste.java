package com.presentation;


import com.dao.entities.Poste;
import com.service.IService.IServicePoste;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Data
@Controller
public class WebControllerPoste {
    private final IServicePoste sp;

    @GetMapping("/home")
    public String GetHome(Module module){
        List<Poste> listPoste = sp.listerPostes();
        return "home";
    }
}
//@data