package by.epam.house.model.device.homeappliance;

import by.epam.house.model.device.ElectricalDevice;

public class Fridge extends ElectricalDevice {
    private CoolingSystem coolingSystem;

    public Fridge(String name, CoolingSystem coolingSystem) {
        super(name);
        this.coolingSystem = coolingSystem;
    }

    public Fridge(String name, int energyConsumption, CoolingSystem coolingSystem) {
        super(name, energyConsumption);
        this.coolingSystem = coolingSystem;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "coolingSystem=" + coolingSystem +
                ", " + super.toString();
    }
}
