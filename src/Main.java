public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Truck truck = new Truck("MANN",  8);
        Bicycle bicycle = new Bicycle("Aist", 2);

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(car);
        station.check(truck);

    }
}