package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
