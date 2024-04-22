/*2. Ticket Pricing:
You are designing a ticket pricing program for a movie theater. The program should prompt the user for 
their age and the type of movie they want to watch (e.g., "regular" or "3D"). Based on the age and 
movie type, the program should calculate and output the ticket price according to the following rules:
Regular Movie:
Age < 18: $8
Age >= 18: $12
3D Movie:
Age < 18: $10
Age >= 18: $15
has context menu*/
import java.util.Scanner;
class Movie 
{
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
		System.out.println("***menu****");
		System.out.println("1.3dmovie");
		System.out.println("2regular movie");
		System.out.println("enter age");
		int age=s.nextInt();
		System.out.println("enter movie type");
		String movietype=s.next();
		
		switch(movietype){
			case "regular":if(age<18)
			{
				System.out.println("cost is 8 rupees");
			}
                else if(age>=18){
					System.out.println("cost is 12 rupeese");
				}
			
			break;
			case "3d":if(age<18)
			{
				System.out.println("cost is 10 rupees");
			}
                else if(age<=18){
					System.out.println("cost is 15 rupeese");
				}
			break;
		}
	}
}
