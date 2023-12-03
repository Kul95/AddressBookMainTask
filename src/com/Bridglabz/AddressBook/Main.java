package com.Bridglabz.AddressBook;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    HashSet<Contacts> set1=new HashSet<>();
    static Scanner sc=new Scanner(System.in);
    static boolean ordering=true;
    static boolean isOrdering=true;
    public static void main(String[] args) {
        Main main=new Main();
        AddressBook addressBook = new AddressBook();
        AddressBook1 addressBook1=new AddressBook1();
        AddressBook2 addressBook2=new AddressBook2();

        do {
            System.out.println("Multiple addressBook");
            System.out.println("Select addressBook:");
            int addressBookDemo=sc.nextInt();
            switch (addressBookDemo){


                case 1:
                    System.out.println("AddressBook1");
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
                            // View Contact details....
                            case 2:
                                System.out.println("View Contact details....");
                                addressBook.display();
                                break;
                            // Update Contacts.....
                            case 3:
                                System.out.println("Update Contacts: ");
                                addressBook.updateContacts();
                                break;
                            // Delete Contacts....
                            case 4:
                                System.out.println("Delete Contacts: ");
                                addressBook.deleteContacts();
                                break;
                            // Exit from program
                            case 5:
                                System.out.println("Ability to add multiple AddressBook..");
                                addressBook.addMultipleContacts();
                                break;
                            case 6:
                                System.out.println("Search by City or State");
//                                addressBook.searchContactByCityOrState();
                            default:
                                System.out.println("Please enter valid choice: ");
                                System.exit(addressBookDemo);
                                break;

                        }
                    } while (isOrdering);


                case 2:
                    System.out.println("AddressBook1...");
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
                                addressBook1.addContact();
                                break;
                            // View Contact details....
                            case 2:
                                System.out.println("View Contact details....");
                                addressBook1.display();
                                break;
                            // Update Contacts.....
                            case 3:
                                System.out.println("Update Contacts: ");
                                addressBook1.updateContacts();
                                break;
                            // Delete Contacts....
                            case 4:
                                System.out.println("Delete Contacts: ");
                                addressBook1.deleteContacts();
                                break;
                            // Exit from program
                            case 5:
                                System.out.println("Ability to add multiple AddressBook..");
                                addressBook1.addMultipleContacts();
                                break;
                            case 6:
                            default:
                                System.out.println("Please enter valid choice: ");
                                break;

                        }
                    } while (isOrdering);


                case 3:
                    System.out.println("AddressBook2...");
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
                                addressBook2.addContact();
                                break;
                            // View Contact details....
                            case 2:
                                System.out.println("View Contact details....");
                                addressBook2.display();
                                break;
                            // Update Contacts.....
                            case 3:
                                System.out.println("Update Contacts: ");
                                addressBook2.updateContacts();
                                break;
                            // Delete Contacts....
                            case 4:
                                System.out.println("Delete Contacts: ");
                                addressBook2.deleteContacts();
                                break;
                            // Exit from program
                            case 5:
                                System.out.println("Ability to add multiple AddressBook..");
                                addressBook2.addMultipleContacts();
                                break;
                            case 6:
                            default:
                                System.out.println("Please enter valid choice: ");
                                break;

                        }
                    } while (isOrdering);
            }

        }
        while (ordering);
    }
}




