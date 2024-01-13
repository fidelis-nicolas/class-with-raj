import com.bank.AfricanCustomers;
import com.bank.AsianCustomers;
import com.bank.Customers;
import com.bank.NigerianCustomers;
import com.cars.Car;
import com.cars.SimpleCars;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        SimpleCars car = new SimpleCars(200, "Honda", "CRV");

        car.engineType();
        car.transMission("manual");

        car.playMusic("Westlife", "Bluetooth");
        car.accelerate(car.getSpeed());



        /*
        // An object is an instance of a class
        Scanner input = new Scanner(System.in);
        Customers demo = new Customers();

      AfricanCustomers af = new AfricanCustomers("Fidelis", "Abuja", 45, 344445, "Africa");
      af.setName("Fielis");
      af.setAddress("NIg");

      AsianCustomers ng = new AsianCustomers("Fidelis", "Abuja", 45, 344445);




        Customers customer1 = new Customers("Fi", "Nig", 46, 48444);
        Customers customer2 = new Customers("Fis", "aust", 46, 4444);
        Customers customer3 = new Customers("Fides", "Eng", 46, 4444484);
        Customers customer4 = new Customers("Fffis", "Nig", 46, 484444484);

        Customers listOfCustomers [] = {customer1, customer4, customer3, customer2, af};

        while(true){
            System.out.println("Enter 1 to view All Customers");
            System.out.println("Enter 2 to search for customers by address");
            System.out.println("Enter 3 to exit");

            System.out.print("Enter your option: ");
            int userOption = input.nextInt();
            if(userOption==1){
                demo.viewAllCustomers(listOfCustomers);
            } else if (userOption==2) {
                System.out.print("Enter address: ");
                String address = input.next();
                demo.searchCustomersByCountry(listOfCustomers, address);

            }
            else {
                break;
            }

        }

*/
    }
}
