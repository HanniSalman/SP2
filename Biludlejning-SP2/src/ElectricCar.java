public class ElectricCar {
    int batteryCapacity;
    int maxRange;

    int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    int getMaxRangeKm(){
        return maxRange;
    }

    int getWhPrKm(){
        return batteryCapacity / maxRange;
    }

    int getRegistrationFee(){
        return 0;
    }

    @Override
    public String toString(){
        return super.toString() + ", battery: " + batteryCapacity + " kWh, range: " + maxRange + " km";
    }
}
