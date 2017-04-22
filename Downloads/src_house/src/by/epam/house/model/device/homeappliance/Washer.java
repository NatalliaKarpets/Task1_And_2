package by.epam.house.model.device.homeappliance;


import by.epam.house.model.device.ElectricalDevice;

public class Washer extends ElectricalDevice {
    private int spinSpeed;

    public Washer(String name, int spinSpeed) {
        super(name);
        this.spinSpeed = spinSpeed;
    }

    public Washer(String name, int energyConsumption, int spinSpeed) {
        super(name, energyConsumption);
        this.spinSpeed = spinSpeed;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "spinSpeed=" + spinSpeed +
                ", " + super.toString();
    }
}
