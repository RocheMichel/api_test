package com.openclassrooms.api.service;

import com.openclassrooms.api.model.Car;
import com.openclassrooms.api.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository bdd;

    public List<Car> renvoie_toutes_les_cars(){
        return this.bdd.getAllCar();
    }
    public Car getCarId(int id){
        List<Car> listDeVoiture =this.bdd.getAllCar();
        int i=0;
        while (i< listDeVoiture.size()){
            Car foufou = listDeVoiture.get(i);
            if (foufou.getId()==id){
                return foufou;
            }
            i++;
        }
        return null;
    }

    public  List<Car>  deleteId(int id){
        List<Car> listDeVoiture =this.bdd.getAllCar();
        for (int i = 0; i<listDeVoiture.size();i++){
            if (listDeVoiture.get(i).getId()==id){
                listDeVoiture.remove(i);
            }
        }
        return listDeVoiture;
    }


}
