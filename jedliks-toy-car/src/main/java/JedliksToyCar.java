public class JedliksToyCar {

    int distance = 0;
    int battery = 100;

    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        if (battery >0) {
            return String.format("Battery at %d%%", battery);
        }
        else {
            return String.format("Battery empty");
        }
    }

    public void drive() {

        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
