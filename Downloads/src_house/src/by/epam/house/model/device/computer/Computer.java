package by.epam.house.model.device.computer;

import by.epam.house.model.device.ElectricalDevice;

public class Computer extends ElectricalDevice {
    private OperatingSystem operatingSystem;

    public Computer(String name, OperatingSystem operatingSystem) {
        super(name);
        this.operatingSystem = operatingSystem;
    }

    public Computer(String name, int energyConsumption, OperatingSystem operatingSystem) {
        super(name, energyConsumption);
        this.operatingSystem = operatingSystem;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "operatingSystem=" + operatingSystem +
                ", " + super.toString();
    }
}
