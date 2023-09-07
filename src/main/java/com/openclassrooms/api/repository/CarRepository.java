package com.openclassrooms.api.repository;
import com.openclassrooms.api.model.Car;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;



@Component
public class CarRepository {
    private List<Car> cars;

    public CarRepository (){
        this.cars = new ArrayList<Car>();
        this.cars.add(new Car(1,"trz","audi","bleu"));
        this.cars.add(new Car(2,"tsz","renauld","vert"));
    }

    public List<Car> getAllCar(){
        return cars;
    }

}
