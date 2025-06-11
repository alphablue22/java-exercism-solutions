class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int distance = 0;
    private int battery = 100;

    //constructor
    NeedForSpeed(int speed, int batteryDrain) {
        //intialize the fields
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(this.battery < this.batteryDrain){
            return true;
        }else
            return false;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        if (car.distanceDriven() >= this.distance){
            return true;
        }else{
            return false;
        }
    }
}
