package com.presentation;


import com.dao.entities.Vote;
import com.service.IService.IServiceVote;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Data
@Controller
public class WebControllerVote {
    private final IServiceVote sv;

    @GetMapping("/home")
    public String getHome(Module module){
        List<Vote>listVote =sv.listerVotes();
        return "home";
    }

}
