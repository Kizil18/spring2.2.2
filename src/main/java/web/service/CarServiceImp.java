package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{
    private List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car("BMW", "5", 10));
        car.add(new Car("Opel", "insignia", 2));
        car.add(new Car("GMC", "ukon", 1));
        car.add(new Car("Lada", "Granta", 12));
        car.add(new Car("Chevrolet", "Lacetti", 18));
    }
    @Override
    public List<Car> getValueCar(int count) {
        return count >= 5 ? car : car.subList(0, count);
    }
}
