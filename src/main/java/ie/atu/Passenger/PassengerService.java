package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@Service
public class PassengerService {

    private final PassengerRepo passengerRepo;
    public List<Passenger> getPassengers() {

        return passengerRepo.findAll();
    }

    public Passenger getPassenger(String PassengerID)
    {
        Passenger myPassenger = new Passenger("mr", "Iwo4", "112344551", 1245612, 34);
        return myPassenger;
    }
    public void savePassenger(Passenger passenger)
    {
        passengerRepo.save(passenger);
    }

    public Passenger findPassengerByName(String name)
    {
        return passengerRepo.findPassengerByName(name);
    }

    public void deletePassenger(Long count)
    {
        passengerRepo.deleteById(count);
    }

    public List<Passenger> findPassengerByAgeRange(int age1, int age2)
    {
        return passengerRepo.findPassengerByAge(age1, age2);
    }

    public void editPassenger(int count, String choice, String value) {
       Passenger passenger = passengerRepo.findPassengerByCount(count);
       switch (choice)
       {
           case "title":
               passenger.title = value;
               break;
           case "name":
               passenger.name = value;
               break;
           case "id":
               passenger.id = value;
               break;
           case "phone":
               passenger.phone = Integer.parseInt(value);
               break;
           case "age":
               passenger.age = Integer.parseInt(value);
               break;
           default:
               break;
       }
       passengerRepo.save(passenger);
    }
}




