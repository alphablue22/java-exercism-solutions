import java.util.Comparator;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort(Comparator.comparingInt(ProductionRemoteControlCar::getNumberOfVictories).reversed());
        return cars; // Return the sorted list
    }
}