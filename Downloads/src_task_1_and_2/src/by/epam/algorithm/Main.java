package by.epam.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    //Sort list or array by string length (Отсортировать список по длине строк)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LengthComparator comparator = new LengthComparator();
        while (true) {
            try {
                System.out.println("Enter array length (integer)");
                int length = Integer.parseInt(in.next());
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < length; i++) {
                    System.out.println("Enter " + i + " element:");
                    list.add(in.next());
                }

                System.out.println("array: " + list);

                Collections.sort(list, comparator);
                System.out.println("sorted array: " + list);

                System.out.println("Do you want to try again (y/n)?");
                if ("n".equals(in.next())) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error. Please try again");
            }
        }
    }


}
