package by.epam.house.comparator;

import by.epam.house.model.device.ElectricalDevice;

import java.util.Comparator;

public class DeviceEnergyConsumptionComparator implements Comparator<ElectricalDevice> {
    @Override
    public int compare(ElectricalDevice o1, ElectricalDevice o2) {
        return o1.getEnergyConsumption() - o2.getEnergyConsumption();
    }
}
