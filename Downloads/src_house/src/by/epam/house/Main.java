package by.epam.house;

import by.epam.house.console.Console;
import by.epam.house.model.device.ElectricalDevice;
import by.epam.house.service.DeviceService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        List<ElectricalDevice> devices = Console.readFromConsole();

        int totalEnergyConsumption = DeviceService.calculateTotalEnergyConsumption(devices);
        System.out.println("Total energy consumption: " + totalEnergyConsumption);

        devices = DeviceService.sortDevicesByEnergyConsumption(devices);
        System.out.println("Devices sorted by energy consumption: " + devices);

        searchForDevice(devices);
    }

    private static void searchForDevice(List<ElectricalDevice> devices) {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Please, enter device name to search:");
                String deviceName = in.next();
                System.out.println("Please, enter device energy consumption to search:");
                int energyConsumption = Integer.parseInt(in.next());
                ElectricalDevice searchResult = DeviceService.findDeviceByNameAndEnergyConsumption(deviceName, energyConsumption, devices);
                System.out.println("Search result: " + searchResult);
                System.out.println("Do you want to search again? \n1 - yes\n2 - no");
                if (Console.NO.equals(in.next())) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error. Please try again");
            }
        }
    }


}
