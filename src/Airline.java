import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
    private List<Plane> planes;

    public Airline() {
        planes = new ArrayList<>();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void displayPlanes() {
        for (Plane plane : planes) {
            plane.displayInfo();
        }
    }

    private int calculateIntSum(boolean isCapacity) {
        int sum = 0;
        for (Plane plane : planes) {
            sum += isCapacity ? plane.getCapacity() : (int) plane.getCarryingCapacity();
        }
        return sum;
    }

    public int totalCapacityCalculator() {
        return calculateIntSum(true);
    }

    public double totalCarryingCapacityCalculator() {
        return calculateIntSum(false);
    }


    public void sorting() {
        planes.sort(Comparator.comparingDouble(Plane::getFlightRange));
        planes.forEach(Plane::displayInfo);
    }




    public Plane findThePlane(double i, double j) {
        for (Plane plane : planes) {
            double n = plane.getFuelConsumption();
            if (i <= n && n <= j) {
                System.out.println("\nЛітак в діапазоні ("+ i + " ; " + j + ") :");
                plane.displayInfo();
                return plane;
            }
        }
        System.out.println("\nАвіакомпанія немає літака в діапазоні ("+ i + " ; " + j + ")");
        return null;
    }
}

