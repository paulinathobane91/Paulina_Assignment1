import java.util.*;
import java.*;
import java.util.Calendar;
import java.time.*;


public class PersonDetails
{
	
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String name = scan.nextLine();
		
		Calendar c = Calendar.getInstance();
		int timeNow = c.get(Calendar.HOUR_OF_DAY);

		if(timeNow >= 0 && timeNow < 12){
		System.out.println("Good Morning " + name);        
		}else if(timeNow >= 12 && timeNow < 16){
		System.out.println("Good Afternoon " + name);
		}else if(timeNow >= 16 && timeNow < 21){
		System.out.println("Good Evening "+name);
		}else{
		System.out.println("Good Night " + name);
		}

		Scanner scan2 = new Scanner(System.in);

		//int age = scan2.nextInt();
		boolean continueInput = true;

		do {
			try{
				System.out.println("Enter your age:");
				int age = scan2.nextInt();
				Random rnd = new Random();

				int num = 18 + rnd.nextInt(73);
				int older = num - age;
				int younger = age - num;
				int twice = num * 2;

				if(num > age)
				{
					System.out.println("I am " + num + " years old, which is "+ older +" years older than you."+'\n'+
							"Twice my age would be "+ twice);
				}
				else{
					System.out.println("I am " + num + " years old, which is "+ younger +" years younger than you."+'\n'+
							"Twice my age would be "+ twice);
				}

				if(num % 2 == 0)
				{
					System.out.println( "My age is even number");
				}
				else{
					System.out.println( "My age is odd number");
				}

				continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Incorrect input: an integer is required");
				scan2.nextLine();
			}
		}
		while (continueInput);

	}
	
}