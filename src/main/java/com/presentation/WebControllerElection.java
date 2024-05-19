package com.presentation;

import com.dao.entities.Election;
import com.dao.repositories.IGestionElection;
import com.service.IService.IServiceElection;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.model.IModel;

import java.util.List;


@Controller
@Data
public class WebControllerElection {
    private final IServiceElection se;

    @GetMapping("/home")
    public String getHome(Model model) {
        List<Election> listElection = se.listerElection();
        return "home";
    }}