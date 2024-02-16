//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app;

import java.util.Scanner;
import service.HotelService;
import serviceImpl.HotelServiceImpl;

public class HotelApp {
    public HotelApp() {
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        HotelService h1 = new HotelServiceImpl();
        System.out.println("============Welcome To Hotel Management System===========");

        while(true) {
            while(true) {
                System.out.println("===========Menu===========");
                System.out.println("1.Room Details\n2.Available Rooms");
                System.out.println("3.Allocate Room\n4.Customer Details\n5.Checkout\n6.Find All Customers\n7.Customer By ID\n8.Exit");
                System.out.println("Enter Your Option:-");
                int op = ip.nextInt();
                switch (op) {
                    case 1:
                        h1.roomInfo();
                        break;
                    case 2:
                        h1.availableRooms();
                        break;
                    case 3:
                        h1.allocateroom();
                        break;
                    case 4:
                        h1.customerDetails();
                        break;
                    case 5:
                        h1.checkout();
                        break;
                    case 6:
                        h1.findAllCustomers();
                        break;
                    case 7:
                        h1.getCustomerById();
                        break;
                    case 8:
                        System.out.println("Thank You Visit Again");
                        System.exit(0);
                }
            }
        }
    }
}

