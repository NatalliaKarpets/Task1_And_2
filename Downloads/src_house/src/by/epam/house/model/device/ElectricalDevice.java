package by.epam.house.model.device;


public abstract class ElectricalDevice implements Switchable {
    private String name;
    private int energyConsumption;
    private boolean isActive;

    public ElectricalDevice(String name) {
        this.name = name;
    }

    public ElectricalDevice(String name, int energyConsumption) {
        this.name = name;
        this.energyConsumption = energyConsumption;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        isActive = true;
    }

    @Override
    public void turnOff() {
        isActive = false;

    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", energyConsumption=" + energyConsumption +
                ", isActive=" + isActive +
                '}';
    }
}
