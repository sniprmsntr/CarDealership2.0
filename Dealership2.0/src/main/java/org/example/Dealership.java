package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private List<Vehicle> vehicles;

    public Dealership() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> getVehiclesByMakeAndModel(String make, String model) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    public List<Vehicle> getVehiclesByYear(int year) {
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear()

