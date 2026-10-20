package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        StringBuilder information = new StringBuilder();

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the following information:");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Please provide billing street: ");
        String street = input.nextLine();

        System.out.print("Please provide billing city: ");
        String city = input.nextLine();

        System.out.print("Please provide billing state: ");
        String state = input.nextLine();

        System.out.print("Please provide billing zip: ");
        String zip = input.nextLine();

        System.out.print("Please provide shipping street: ");
        String sStreet = input.nextLine();

        System.out.print("Please provide shipping city: ");
        String sCity= input.nextLine();

        System.out.print("Please provide shipping state: ");
        String sState = input.nextLine();

        System.out.print("Please provide shipping zip: ");
        String sZip = input.nextLine();
        System.out.println();

        information.append("Billing Address:\n");
        information.append(street).append("\n");
        information.append(city).append(", ");
        information.append(state).append(" ");
        information.append(zip).append("\n\n");

        information.append("Shipping Address:\n");
        information.append(sStreet).append("\n");
        information.append(sCity).append(", ");
        information.append(sState).append(" ");
        information.append(sZip).append("\n");

        String info = information.toString();
        System.out.println(info);
        input.close();





    }
}
