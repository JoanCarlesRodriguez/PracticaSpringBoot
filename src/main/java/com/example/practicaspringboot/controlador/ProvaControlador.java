package com.example.practicaspringboot.controlador;

import org.springframework.beans.factory.annotation.Value;      //Aquest import no me'l fa, pero es des @Value
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/prova")       //S'arrel d'on anam amb tot
public class ProvaControlador {

    @GetMapping({"/","/mostrarTitol"})
    public String visualitzarTitol(ModelMap model){
        model.addAttribute("titol","holitaaa");
        return "mostrarTitol";       //Nom de s'arxiu que s'ha de visualitzar HTML
    }


    @Value("${index.salutacio}")    //Agafa sa variable index.salutacio de application.properties
    private String salutacio;       //li donam aquest valor a salutacio

    @PostMapping("/resposta")
    public String resposta(@RequestParam(name="nom") String nom ,ModelMap model){   //Aquest name = nom es es valor de s'input des Request
        String textComplet = "El nom que has escrit es: " .concat(nom);
        //model.addAttribute("text", textComplet); //Es primer valor es esq agaf dsp dins html
        model.addAttribute("text",salutacio);
        return "resposta";
    }


}
