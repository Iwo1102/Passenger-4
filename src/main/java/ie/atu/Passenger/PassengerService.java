package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
}
