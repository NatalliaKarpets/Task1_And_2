package by.epam.house.model.device.video;

import by.epam.house.model.device.ElectricalDevice;

public class Television extends ElectricalDevice {
    private DisplayType displayType;

    public Television(String name,  DisplayType displayType) {
        super(name);
        this.displayType = displayType;
    }

    public Television(String name, int energyConsumption, DisplayType displayType) {
        super(name, energyConsumption);
        this.displayType = displayType;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    @Override
    public String toString() {
        return "Television{" +
                "displayType=" + displayType +
                ", " + super.toString();
    }
}
