package by.epam.house.service;

import by.epam.house.comparator.DeviceEnergyConsumptionComparator;
import by.epam.house.model.device.ElectricalDevice;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DeviceService {

    public static int calculateTotalEnergyConsumption(List<ElectricalDevice> devices) {
        int totalEnergyConsumption = 0;
        for (ElectricalDevice device : devices) {
            if (device != null && device.isActive()) {
                totalEnergyConsumption = totalEnergyConsumption + device.getEnergyConsumption();
            }
        }
        return totalEnergyConsumption;
    }

    public static List<ElectricalDevice> sortDevicesByEnergyConsumption(List<ElectricalDevice> devices) {
        Collections.sort(devices, new DeviceEnergyConsumptionComparator());
        return devices;
    }

    public static ElectricalDevice findDeviceByNameAndEnergyConsumption(String name, int energyConsumption, List<ElectricalDevice> devices) {
        for (ElectricalDevice device : devices) {
            if (device != null && Objects.equals(device.getName(), name) && Objects.equals(device.getEnergyConsumption(), energyConsumption)) {
                return device;
            }
        }
        return null;
    }
}
