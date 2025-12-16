
import java.util.Hashtable;
import java.util.Scanner;

public class AddresBook {
    //HAshTable<Phonenumber, Contact Object>
    Hashtable<String,Contact> adBook ;

    public void addContact (Contact c){
        //we are checking if the phonenuumber is present or not
        if (adBook.containsKey(c.phoneNumber)){
            System.out.println("Contact already present");
        }else{
            adBook.put(c.phoneNumber,c);
            System.out.println("Conatact added");
        }

    }

    public void updateContact(String p){
        if (adBook.containsKey(p)){
            Contact c1 = adBook.get(p);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name");
            c1.firstName = sc.next();
            System.out.println("Enter Last Name");
            c1.lastName = sc.next();
            System.out.println("Enter Address");
            c1.address = sc.next();
            System.out.println("Enter City");
            c1.city = sc.next();
            System.out.println("Enter State");
            c1.state = sc.next();
            System.out.println("Enter Phone Number");
            c1.phoneNumber = sc.next();
            System.out.println("Enter EMAIL");
            c1.email = sc.next();
            System.out.println("Enter Pin" );
            c1.pin = sc.nextInt();
        }else{
            System.out.println("Conatact not found");
        }
    }

    public void deleteContact(String p){
        if (adBook.containsKey(p)){
            adBook.remove(p);
        }else{
            System.out.println("Conatact not found");
        }
    }
    public void displayAllContact(){
        System.out.println(adBook);
    }
    public void displayContact(String p){

        if (adBook.containsKey(p)){
            System.out.println(adBook.get(p));
        }else{
            System.out.println("Conatact not found");
        }
    }





}
