import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddresBook a1 = new AddresBook();
        Scanner sc = new Scanner(System.in);
        int count =1;
        int menuOption;
        do{
            System.out.println("Welcome to AddressBook");
            displayMenu();
            menuOption = sc.nextInt();
            switch (menuOption){
                case 1->{
                    Contact c= createContact();
                    a1.addContact(c);
                }
                case 2->{
                    System.out.println("Enter the user phone number to delete");
                    String p1 = sc.next();
                    a1.deleteContact(p1);
                }
                case 3->{
                    System.out.println("Enter the user phone number to edit");
                    String p1 = sc.next();
                    a1.updateContact(p1);
                }
                case 4->{
                    System.out.println("Enter the user phone number to display");
                    String p1 = sc.next();
                    a1.displayContact(p1);
                }
                case 5->{
                    a1.displayAllContact();
                }
                default -> {
                    System.out.println("Wrong Input");
                }
            }
            System.out.println("Enter 0 to exit");
            count= sc.nextInt();
        }while (count!=0);
    }

    public static void displayMenu(){
        System.out.println("Enter 1 to add a Contact");
        System.out.println("Enter 2 to remove a Contact");
        System.out.println("Enter 3 to edit a Contact");
        System.out.println("Enter 4 to display a Contact");
        System.out.println("Enter 5 to show all Contacts");
    }
    public static Contact createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        System.out.println("Enter Address");
        String address = sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = sc.next();
        System.out.println("Enter EMAIL");
        String email = sc.next();
        System.out.println("Enter Pin" );
        int pin = sc.nextInt();



        return new Contact(firstName,lastName,address,city,state,phoneNumber,email,pin);
    }
}
