package com.openclassrooms.api.controller;

import com.openclassrooms.api.model.Car;// me permet de connecter ma page controller avec les elements qui ce trouve dans ma class model
import com.openclassrooms.api.service.CarService;// me permet de connecter ma page controller avec les elements qui ce trouve dans ma class model
import org.springframework.beans.factory.annotation.Autowired;// Autowired me permet d'instacier directeemnt l'objet carservice
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService service;

    @GetMapping("/modeles")//me permet de créer l'adresse url ex: localhost/8808(nom du port)/allcar j'aurais si je rentre cette adresse accés a toute les voiture de ma liste du tableau sur le moniteur
    public List<Car> renvoyer_la_requete_de_toutes_les_cars(){// methode qui me return toutes les voitures
        return this.service.renvoie_toutes_les_cars();
    }

    @GetMapping("/modeles/{ids}")//me permet de créer l'adresse url ex: localhost/8808(nom du port)/carbyid/1 j'aurais si je rentre cette adresse accés l'id de la voiture que je souhaite dans ma liste du tableau sur le moniteur
    public Car renvoyer_une_voiture(@PathVariable(name = "ids") int id){
        return this.service.getCarId(id);
    }
    @GetMapping("/modeles/{id}")//me permet de créer l'adresse url ex: localhost/8808(nom du port)/carbyid/1 j'aurais si je rentre cette adresse accés l'id de la voiture que je souhaite dans ma liste du tableau sur le moniteur
    public  List<Car>  deleteId(@PathVariable(name = "id") int id){
        return this.service.deleteId(id);
    }

}
