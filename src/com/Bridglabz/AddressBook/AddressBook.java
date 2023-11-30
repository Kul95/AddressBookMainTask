package com.Bridglabz.AddressBook;

import java.util.HashSet;
import java.util.Scanner;

public class AddressBook {
    HashSet set=new HashSet();
    Scanner sc=new Scanner(System.in);
    public void addContact(){
        System.out.println("Add details: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName=sc.nextLine();
        System.out.println("Enter last name:");
        String lastName=sc.nextLine();
        System.out.println("Enter the address : ");
        String address=sc.nextLine();
        System.out.println("Enter the city: ");
        String city = sc.nextLine();
        System.out.println("Enter the state: ");
        String state = sc.nextLine();
        System.out.println("Enter the zip Code: ");
        int zip = sc.nextInt();
        System.out.println("Enter the phone number: ");
        long phone = sc.nextLong();
        System.out.println("Enter the email: ");
        String email = sc.nextLine();
        Contacts contacts=new Contacts(firstName,lastName,address,city,state,zip,phone,email);
        set.add(contacts);
        System.out.println("Contact details added successfully...." + set);
    }
    static boolean ordering = true;
    public static void main(String[] args) {
        AddressBook addressBook=new AddressBook();
        Scanner sc = new Scanner(System.in);
        // Do while loop....
        do {
            System.out.println("Welcome to AddressBook Project"
                    + "\n1. Add Contact Details"
                    + "\n2. View Contact details"
                    + "\n3.Update Contact details"
                    + "\n4. Delete Contact details"
                    + "\n5. View All Contact details"
                    + "\n6. Exit ");
            System.out.println("Enter the choice! :");
            int choice = sc.nextInt();
            // Switch Cases..........
            switch (choice) {
                //Add contacts...
                case 1:
                    System.out.println("Add Contacts: ");
                    addressBook.addContact();
                    break;
                // Update Contacts.....
                case 3:
                    System.out.println("Update Contacts: ");
                    break;
                // Delete Contacts....
                case 4:
                    System.out.println("Delete Contacts: ");
                    break;
                default:
                    System.out.println("Please enter valid choice: ");
                    break;
                // Exit from program
                case 6:
                    System.out.println("Exit  " + "\n Thank you for using This application");
                    break;

            }
        } while (ordering);
    }
}
