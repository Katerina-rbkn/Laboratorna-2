

public class Main {

    public static void main(String[] args){
        Plane[] planes = new Plane[]{
                new ShortHaul(" Embraer E170", 66, 9.759, 9.335, 3982),
                new ShortHaul(" Bombardier CRJ900", 88, 10.53, 8.762, 2950),
                new MediumHaul(" Boeing 737", 189,63.34, 26.020, 5628),
                new MediumHaul("Airbus A320", 180, 77, 24.210, 6150 ),
                new LongHaul("Airbus A350", 440, 268, 138.000, 15000),
                new LongHaul("Boeing 787 Dreamliner",381, 218, 126.206,13620 )
                };
        Airline airline = new Airline();
        for(Plane plane : planes){
            airline.addPlane(plane);
        }

        System.out.println("\nУсі літаки авіакомпанії:");
        airline.displayPlanes();

        System.out.println("\n\nЗагальна місткість авіакомпанії: " + airline.totalCapacityCalculator()+ " осіб.");

        System.out.println("\nЗагальна вантажопідйомність авіакомпанії: " + airline.totalCarryingCapacityCalculator() + " тон.\n");


        System.out.println("Відсортовані літаки компанії за дальністю польоту. " );
        airline.sorting();
        System.out.println("\n");



        double firstValue = 4.2;
        double secondValue = 5;

        airline.findThePlane(firstValue, secondValue);

        double thirtValue = 8.946;
        double fourthValue = 25.395;
        airline.findThePlane(thirtValue, fourthValue);

    }

}

