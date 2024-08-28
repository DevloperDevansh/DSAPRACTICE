import java.util.Scanner;

class thlab4 {
   public static void main(String[] args) {
     
        Scanner scn = new Scanner(System.in);
        String[] roomTypes = {"luxury", "a/c", "non a/c", "delux", "general"};
        int[] costPerDay = {2500, 2000, 1500, 1200, 500};


        System.out.println("Enter the roomtype");
       
        System.out.println("press 1: luxury");
        System.out.println("press 2: a/c");
        System.out.println("press 3: non a/c");
        System.out.println("press 4: delux");
        System.out.println("press 5: general");

        System.out.println("press any key which customer want");
        int key = scn.nextInt();

        System.out.println("Enter the number of days the customer stayed");
        int days = scn.nextInt();
       
        int  totalbill =  costPerDay[key-1] * days;
        System.out.println("TotalBill ::"+totalbill);

    }
    
}
