package virtualmethod.vehicle;

public class Van extends Car {

    private int cargoWeight;

    public Van(int numberPassenger, int vehicleWeight, int cargoWeight) {
        super(vehicleWeight, numberPassenger);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return cargoWeight + super.getGrossLoad();
    }

    @Override
    public String toString() {
        return "Van{cargoWeight=" + cargoWeight + ", numberOfPassenger=" + super.getNumberPassenger() + ", vehicleWeight=" + super.getVehicleWeight() + '}';
    }
}
