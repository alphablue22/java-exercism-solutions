public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed <= 4) {
            return (double) speed * 221;
        }
        if (speed >= 5 && speed <= 8) {
            return (double) ((speed * 221) - (speed * 221 *.10));
        }
        if (speed == 9) {
            return (double) ((speed * 221) - (speed * 221 *.20));
        }
        if (speed == 10) {
            return (double) ((speed * 221) - (speed * 221 *.23));
        }else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        if (speed > 0 && speed <= 4) {
            return (int) (221 / 60);
        }
        if (speed >= 5 && speed <= 8) {
            return (int) (((221.0 / 60) * speed)*.90);
        }
        if (speed == 9) {
            return (int) (((221.0 / 60) * speed)*.80);
        }
        if (speed == 10) {
            return (int) (((221.0 / 60) * speed)*.77);
        }else {
            return 0;
        }

    }
}
