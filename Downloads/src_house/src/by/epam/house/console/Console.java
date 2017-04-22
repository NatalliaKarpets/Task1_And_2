package by.epam.house.console;

import by.epam.house.model.device.ElectricalDevice;
import by.epam.house.model.device.computer.Computer;
import by.epam.house.model.device.computer.OperatingSystem;
import by.epam.house.model.device.homeappliance.CoolingSystem;
import by.epam.house.model.device.homeappliance.Fridge;
import by.epam.house.model.device.homeappliance.Washer;
import by.epam.house.model.device.video.DisplayType;
import by.epam.house.model.device.video.Television;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Console {
    public static final String YES = "1";
    public static final String NO = "2";

    public static List<ElectricalDevice> readFromConsole() {
        Scanner in = new Scanner(System.in);
        int index = 0;
        List<ElectricalDevice> devices = new ArrayList<>();
        while (true) {
            try {
                System.out.println("Enter digit to create device:\n1 - Computer\n2 - Television\n3 - Washer\n4 - Fridge");
                ElectricalDevice device = createDevice(in, index);
                devices.add(device);
                index++;

                System.out.println("Do you want to create one more device? \n1 - yes\n2 - no");
                if (NO.equals(in.next())) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error. Please try again");
            }
        }
        System.out.println("Created devices: " + devices + "\n------------------");
        return devices;
    }

    private static ElectricalDevice createDevice(Scanner in, int index) {
        ElectricalDevice device;
        switch (in.next()) {
            case "1": {
                device = new Computer("pc-" + index, OperatingSystem.WINDOWS);
                break;
            }
            case "2": {
                device = new Television("tv-" + index, DisplayType.LCD);
                break;
            }
            case "3": {
                device = new Washer("washer-" + index, index);
                break;
            }
            case "4": {
                device = new Fridge("fridge-" + index, CoolingSystem.FULL_NO_FROST);
                break;
            }
            default: {
                throw new InputMismatchException("Incorrect device type. Please try again");
            }
        }

        System.out.println("Enter energy consumption value (integer):");
        device.setEnergyConsumption(Integer.parseInt(in.next()));

        System.out.println("Turn On the device?\n1 - yes\n2 - no");
        if (YES.equals(in.next())) {
            device.turnOn();
        }

        System.out.println("Device created: " + device);
        return device;
    }

}
