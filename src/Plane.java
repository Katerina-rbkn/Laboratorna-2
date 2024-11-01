
public abstract class Plane {
    private  String name;
    private  int capacity;
    private  double carryingCapacity;
    private  double fuelConsumption;
    private  double flightRange;


    public Plane(String name, int capacity, double carryingCapacity, double fuelConsumption, double flightRange ){
       this.name = name;
       this.capacity = capacity;
       this.carryingCapacity = carryingCapacity;
       this.fuelConsumption = fuelConsumption;
       this.flightRange = flightRange;
    }

    public  String getName(){

        return name;
    }

    public int getCapacity(){

        return capacity;
    }

    public  double getCarryingCapacity(){

        return carryingCapacity;
    }
    public double getFuelConsumption(){

        return fuelConsumption;
    }

    public double getFlightRange(){

        return flightRange;
    }

    public void displayInfo() {
        System.out.printf("\n\nТип літака: %s \nНазва: %s\nМісткість: %d осіб \nВантажопідйомність: %.2f тон \nЗапас пального: %.2f літрів \nДальність польоту: %.1f км.",
                getClass().getSimpleName(),getName(), getCapacity(), getCarryingCapacity(), getFuelConsumption(), getFlightRange() );
    }

}



class ShortHaul extends Plane{
    public ShortHaul(String name, int capacity, double carryingCapacity, double fuelConsumption, double flightRange){
        super(name, capacity, carryingCapacity, fuelConsumption, flightRange);
    }


}

 class MediumHaul extends Plane{
    public MediumHaul(String name, int capacity, double carryingCapacity, double fuelConsumption, double flightRange){
        super(name, capacity, carryingCapacity, fuelConsumption, flightRange);
    }

}

 class LongHaul extends Plane{
    public LongHaul(String name, int capacity, double carryingCapacity, double fuelConsumption, double flightRange){
        super(name, capacity, carryingCapacity, fuelConsumption, flightRange);
    }

}
