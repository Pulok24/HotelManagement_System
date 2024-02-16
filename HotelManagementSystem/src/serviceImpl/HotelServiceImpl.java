//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package serviceImpl;

import dao.HotelRepo;
import entity.CustomerAddress;
import entity.customer;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import service.HotelService;

public class HotelServiceImpl implements HotelService, HotelRepo {
    Scanner ip;

    public HotelServiceImpl() {
        this.ip = new Scanner(System.in);

        int i;
        for(i = 1; i <= 10; ++i) {
            cm.put(i, (customer)null);
        }

        for(i = 1; i <= 8; ++i) {
            sm.put(i, (customer)null);
        }

        for(i = 1; i <= 5; ++i) {
            dm.put(i, (customer)null);
        }

    }

    public void roomInfo() {
        System.out.println("===============Classic Rooms==============");
        System.out.println("Hot Water:Yes");
        System.out.println("AC:No");
        System.out.println("Tv:No");
        System.out.println("Wifi:No");
        System.out.println("Price:2000 Rs");
        System.out.println("===============Standard Rooms==============");
        System.out.println("Hot Water:Yes");
        System.out.println("AC:No");
        System.out.println("Tv:Yes");
        System.out.println("Wifi:No");
        System.out.println("Price:2500 Rs");
        System.out.println("===============Deluxe Rooms==============");
        System.out.println("Hot Water:Yes");
        System.out.println("AC:Yes");
        System.out.println("Tv:Yes");
        System.out.println("Wifi:Yes");
        System.out.println("Price:3500 Rs");
    }

    public void checkRooms(LinkedHashMap<Integer, customer> l1) {
        boolean flag = false;
        Iterator var3 = l1.keySet().iterator();

        while(var3.hasNext()) {
            Integer ele = (Integer)var3.next();
            if (l1.get(ele) == null) {
                System.out.print("" + ele + " ");
                flag = true;
            }
        }

        System.out.println();
        if (!flag) {
            System.out.println("No Rooms Available");
        }

    }

    public void availableRooms() {
        System.out.println("===========Available Rooms==========");
        System.out.println("===========Classic Rooms=============");
        this.checkRooms(cm);
        System.out.println("===========Standard Rooms============= ");
        this.checkRooms(sm);
        System.out.println("============Deluxe Rooms===============");
        this.checkRooms(dm);
    }

    customer createCustomer() {
        System.out.println("========Enter Customer Details========");
        System.out.println("Enter Customer Name:-");
        String cname = this.ip.next();
        System.out.println("Enter Customer Id:-");
        int cid = this.ip.nextInt();
        System.out.println("Enter Customer Age:-");
        int cage = this.ip.nextInt();
        System.out.println("Enter Customer Phno:-");
        long cphno = this.ip.nextLong();
        System.out.println("Enter Customer Email:-");
        String cmail = this.ip.next();
        System.out.println("Enter Door No:-");
        int dn = this.ip.nextInt();
        System.out.println("Enter Street Address:-");
        this.ip.nextLine();
        String street = this.ip.nextLine();
        System.out.println("Enter District:-");
        String dst = this.ip.next();
        System.out.println("Enter State:-");
        String state = this.ip.next();
        System.out.println("Enter Country:-");
        String cnt = this.ip.next();
        System.out.println("Enter Pincode:-");
        int pincode = this.ip.nextInt();
        CustomerAddress a = new CustomerAddress(dn, street, dst, state, cnt, pincode);
        return new customer(cname, cid, cage, cphno, cmail, a);
    }

    void mapRoom(LinkedHashMap<Integer, customer> l1, int roomNo, double amt) {
        if (l1.get(roomNo) == null) {
            customer c = this.createCustomer();
            a1.add(c);
            l1.put(roomNo, c);
            c.setcAmt(amt);
            System.out.println("Room No:" + roomNo + " had been alloocated for " + c.getCname());
            System.out.println("===========================================");
        } else {
            System.out.println("Room is not available.......!!!!!");
        }

    }

    public void allocateroom() {
        System.out.println("=============Menu===========");
        System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
        int op = this.ip.nextInt();
        switch (op) {
            case 1:
                System.out.println("Enter Room No.....!!!");
                int roomNo1 = this.ip.nextInt();
                if (roomNo1 >= 1 && roomNo1 <= 10) {
                    this.mapRoom(cm, roomNo1, 2000.0);
                } else {
                    System.out.println("Enter Correct Room No.....!!!!");
                }
                break;
            case 2:
                System.out.println("Enter Room No.....!!!");
                int roomNo2 = this.ip.nextInt();
                if (roomNo2 >= 1 && roomNo2 <= 8) {
                    this.mapRoom(sm, roomNo2, 2500.0);
                } else {
                    System.out.println("Enter Correct Room No.....!!!!");
                }
                break;
            case 3:
                System.out.println("Enter Room No.....!!!");
                int roomNo3 = this.ip.nextInt();
                if (roomNo3 >= 1 && roomNo3 <= 5) {
                    this.mapRoom(dm, roomNo3, 3500.0);
                } else {
                    System.out.println("Enter Correct Room No.....!!!!");
                }
                break;
            default:
                System.out.println("Invalid Option......!!!!");
        }

    }

    public void checkDetails(LinkedHashMap<Integer, customer> L1) {
        Iterator var2 = L1.keySet().iterator();

        while(var2.hasNext()) {
            Integer ele = (Integer)var2.next();
            if (L1.get(ele) != null) {
                System.out.println("Room No- " + ele + " Details:- " + String.valueOf(L1.get(ele)));
            } else {
                System.out.println("" + ele + " No. Room is available");
            }
        }

    }

    public void customerDetails() {
        System.out.println("==========Classic Rooms===========");
        this.checkDetails(cm);
        System.out.println("============Standard Rooms===========");
        this.checkDetails(sm);
        System.out.println("==============Deluxe Rooms=============");
        this.checkDetails(dm);
    }

    void unMapRoom(LinkedHashMap<Integer, customer> l1, int roomNo) {
        if (l1.get(roomNo) != null) {
            customer c1 = (customer)l1.get(roomNo);
            System.out.println(c1);
            PrintStream var10000 = System.out;
            String var10001 = c1.getCname();
            var10000.println(var10001 + " need to pay " + c1.getcAmt() + " Rs.");
            l1.put(roomNo, (Object)null);
        } else {
            System.out.println("Invalid RoomNo....!!!!");
        }

    }

    public void checkout() {
        System.out.println("=============Menu===========");
        System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
        int op = this.ip.nextInt();
        System.out.println("Enter the Room No:-");
        int roomno = this.ip.nextInt();
        switch (op) {
            case 1:
                if (roomno >= 1 && roomno <= 10) {
                    this.unMapRoom(cm, roomno);
                } else {
                    System.out.println("Invalid Room No...!!!");
                }
                break;
            case 2:
                if (roomno >= 1 && roomno <= 8) {
                    this.unMapRoom(sm, roomno);
                } else {
                    System.out.println("Invalid Room No...!!!");
                }
                break;
            case 3:
                if (roomno >= 1 && roomno <= 5) {
                    this.unMapRoom(dm, roomno);
                } else {
                    System.out.println("Invalid Room No...!!!");
                }
        }

    }

    public void findAllCustomers() {
        if (a1.size() == 0) {
            System.out.println("Database is Empty...!!!");
        } else {
            Iterator var1 = a1.iterator();

            while(var1.hasNext()) {
                customer ele = (customer)var1.next();
                System.out.println(ele);
            }
        }

    }

    public void getCustomerById() {
        boolean flag = false;
        System.out.println("Enter the customer id:-");
        int cid = this.ip.nextInt();
        Iterator var3 = a1.iterator();

        while(var3.hasNext()) {
            customer ele = (customer)var3.next();
            if (ele.getCid() == cid) {
                System.out.println(ele);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Invalid Customer Id...!!!!");
        }

    }
}

