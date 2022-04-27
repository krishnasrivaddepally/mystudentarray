/*
Write a program to implement Hostel Booking Portal where provide the options:
E.g: Air-cooler
       Air-condition
       Apartment
Then provide the appropriate seater options along with their fees.

Ask the student to select the Hostel and book it.
*/

import java.util.*;

class Hostel_Booking
{
    private static String [][] aircooler_rooms = {
				{"4 Seater", "54500" , "120"},
				{"3 Seater", "64500" , "90"},
				{"2 Seater", "79500" , "60"},
				{"1 Seater", "99500" , "60"}
			};

    private static String [][] aircondition_rooms = {
				{"4 Seater", "64500" , "120"},
				{"3 Seater", "79500" , "60"},
				{"2 Seater", "89500" , "30"}
			};

    private static String [][] apartment_rooms = {
				{"2 Seater", "125000" , "20"},
				{"1 Seater", "149000" , "10"}
			};
    private static String [][] dorimitory_rooms = {
				{"16 Seater", "32500" , "90"},
				{"8 Seater", "36500" , "60"},
				{"4 Seater", "42500" , "120"}
			};



     public static void main(String [] rk)
         {
	Scanner sc = new Scanner(System.in);
	System.out.println("\n-----------Hostel Booking-------------\n");
	System.out.println("\t1. Aircooler");
	System.out.println("\t2. Aircondition");
	System.out.println("\t3. Apartment");
	System.out.println("\t4. Dormitory");
	System.out.println("\t0. EXIT");

	System.out.print("\n\tEnter you Choice: ");
	int choice = sc.nextInt();

Console.clrscr();    //Userdefined class 

	switch(choice)
	{
	    case 1:   System.out.println("\n\tYou have selected Aircooler...\n");

		System.out.println("\t\tCategory\t\tAnnual Fee\t\tSeats");
		System.out.println("\t--------------------------------------------------------------");
		int i=1;
		for(String [] s : aircooler_rooms)
		    System.out.println("\t"+ i++ +"\t"+s[0] + "\t\t" + s[1] + "\t\t\t" + s[2]);
		break;

	    case 2: System.out.println("\nYou have selected Aircondition...");

		System.out.println("\t\tCategory\t\tAnnual Fee\t\tSeats");
		System.out.println("\t--------------------------------------------------------------");
		int j=1;
		for(String [] s : aircondition_rooms)
		    System.out.println("\t"+ j++ +"\t"+s[0] + "\t\t" + s[1] + "\t\t\t" + s[2]);
		break;
	    case 3: System.out.println("\nYou have selected Apartment...");

		System.out.println("\t\tCategory\t\tAnnual Fee\t\tSeats");
		System.out.println("\t--------------------------------------------------------------");
		int k=1;
		for(String [] s : apartment_rooms)
		    System.out.println("\t"+ k++ +"\t"+s[0] + "\t\t" + s[1] + "\t\t\t" + s[2]);
		break;
	    case 4: System.out.println("\nYou have selected Dorimitory...");

		System.out.println("\t\tCategory\t\tAnnual Fee\t\tSeats");
		System.out.println("\t--------------------------------------------------------------");
		int l=1;
		for(String [] s : dorimitory_rooms)
		    System.out.println("\t"+ l++ +"\t"+s[0] + "\t\t" + s[1] + "\t\t\t" + s[2]);
		break;
	    case 0: System.exit(5);
	    default: System.out.println("\nYou have entered INVALID value");		
	}
         }
}


class Console
{   static void clrscr()
	{
	    try{
	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
	    catch(Exception e){}
	}
}