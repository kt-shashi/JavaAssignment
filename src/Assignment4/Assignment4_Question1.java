//import java.util.Scanner;
//
//class Bus {
//
//    int regdno;
//    String model;
//    int capacity;
//
//    public void showBusDetails() {
//        System.out.println("Registration number: " + regdno);
//        System.out.println("Model: " + model);
//        System.out.println("Capacity: " + capacity);
//    }
//
//}
//
//class PublicBus extends Bus {
//    String owner;
//    String from;
//    String to;
//    String depttime;
//    String arrivaltime;
//
//    public void showBusdetails() {
//        System.out.println("Registration number: " + regdno);
//        System.out.println("Model: " + model);
//        System.out.println("Capacity: " + capacity);
//
//        System.out.println("Owner: " + owner);
//        System.out.println("From: " + from);
//        System.out.println("To: " + to);
//        System.out.println("Departure time: " + depttime);
//        System.out.println("Arrival time: " + arrivaltime);
//
//    }
//
//}
//
//class LuxuryPublicBus extends PublicBus {
//    boolean isAC;
//    boolean isWifi;
//    int noofsleeperseat;
//
//    public void showBusdetails() {
//        System.out.println("Registration number: " + regdno);
//        System.out.println("Model: " + model);
//        System.out.println("Capacity: " + capacity);
//
//        System.out.println("Owner: " + owner);
//        System.out.println("From: " + from);
//        System.out.println("To: " + to);
//        System.out.println("Departure time: " + depttime);
//        System.out.println("Arrival time: " + arrivaltime);
//
//        System.out.println("AC: " + isAC);
//        System.out.println("WIFI: " + isWifi);
//        System.out.println("No of sleeper seats: " + noofsleeperseat);
//    }
//
//    public void setData(int regdno, String model, int capacity, String owner, String from, String to, String depttime, String arrivaltime, boolean isAC, boolean isWifi, int noofsleeperseat) {
//
//        this.regdno = regdno;
//        this.model = model;
//        this.capacity = capacity;
//        this.owner = owner;
//        this.from = from;
//        this.to = to;
//        this.depttime = depttime;
//        this.arrivaltime = arrivaltime;
//        this.isAC = isAC;
//        this.isWifi = isWifi;
//        this.noofsleeperseat = noofsleeperseat;
//    }
//}
//
//class Assignment4_Question1 {
//
//    public static void main(String[] args) {
//
//        int regdno, capacity, noofsleeperseat;
//        String model, owner, from, to, depttime, arrivaltime;
//        boolean isAC, isWifi;
//        int choice;
//        Scanner inputHelper = new Scanner(System.in);
//        System.out.println("Enter Registration number: ");
//        regdno = inputHelper.nextInt();
//        System.out.println("Enter Model: ");
//        model = inputHelper.next();
//        System.out.println("Enter Capacity: ");
//        capacity = inputHelper.nextInt();
//        System.out.println("Enter Owner: ");
//        owner = inputHelper.next();
//        System.out.println("Enter From: ");
//        from = inputHelper.next();
//        System.out.println("Enter To: ");
//        to = inputHelper.next();
//        System.out.println("Enter Departure time: ");
//        depttime = inputHelper.next();
//        System.out.println("Enter Arrival time: ");
//        arrivaltime = inputHelper.next();
//        System.out.println("Is AC available: (1: Yes, 0: No)");
//        choice = inputHelper.nextInt();
//        if (choice == 1)
//            isAC = true;
//        else isAC = false;
//        System.out.println("Is WIFI enabled: (1: Yes, 0: No)");
//        choice = inputHelper.nextInt();
//        if (choice == 1)
//            isWifi = true;
//        else isWifi = false;
//        System.out.println("Enter No of sleeper seats: ");
//        noofsleeperseat = inputHelper.nextInt();
//        LuxuryPublicBus luxuryPublicBus = new LuxuryPublicBus();
//        luxuryPublicBus.setData(regdno, model, capacity, owner, from, to, depttime, arrivaltime, isAC, isWifi, noofsleeperseat);
//        luxuryPublicBus.showBusdetails();
//
//    }
//
//}
