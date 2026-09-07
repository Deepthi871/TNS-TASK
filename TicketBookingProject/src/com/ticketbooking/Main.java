package com.ticketbooking;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p = sc.nextLine().split(",");
        TicketBooking tb = new TicketBooking(p[0], p[1], Integer.parseInt(p[2].trim()));
        int ch = Integer.parseInt(sc.nextLine().trim());
        if(ch==1){
            Double amt = Double.parseDouble(sc.nextLine().trim());
            tb.makePayment(amt);
        } else if(ch==2){
            Double amt = Double.parseDouble(sc.nextLine().trim());
            String wallet = sc.nextLine().trim();
            tb.makePayment(wallet, amt);
        } else if(ch==3){
            String name = sc.nextLine().trim();
            String card = sc.nextLine().trim();
            Double amt = Double.parseDouble(sc.nextLine().trim());
            String ccv = sc.nextLine().trim();
            tb.makePayment(card, ccv, name, amt);
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}