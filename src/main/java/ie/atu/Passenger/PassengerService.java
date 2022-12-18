package ie.atu.Passenger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PassengerService {
    public List<Passenger> getPassengers() {
        List<Passenger> myPassenger = List.of(
                new Passenger("mr", "Iwo", "1234678901", 1245612, 34),
                new Passenger("mr", "Iwo2", "1234678901", 1245612, 22),
                new Passenger("mr", "Iwo3", "2112678901", 1245612, 76));
        return myPassenger;
    }

    public Passenger getPassenger(String passengerID)
    {
        Passenger myPassenger = new Passenger("mr", "Iwo4", "112344551", 1245612, 34);
        return myPassenger;
    }
}
