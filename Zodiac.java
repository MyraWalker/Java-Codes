// Myra Walker


import java.util.Scanner; // Allows the program to receive access to the Java scanner.

public class Zodiac {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in); // Allows the program to receive input from the keyboard.
		System.out.println("What is your zodiac? Enter your birthday to find out.\nPlease enter your birth month as a number: ");
		System.out.println();
		int month = k.nextInt();
		System.out.println("Please enter your birth day as a number: ");
		int day = k.nextInt();
		
		
		if(month <1 || month>12) 
		{
			System.out.println("Invalid Month");
		} //Won't allow user to enter non-month numbers.
		
			else if(day <1 || day>31) 
			{
				System.out.println("Invalid Day");
			}  //Won't allow user to enter non-day numbers.

			else if(((month==12 && (day>=22 && day<=31)) || (month==1 &&  (day>=1 && day<=19)))) 
			{
				System.out.println("Congradulations, your a Capricorn!");
			}
			
			else if((month==1 && (day>=20 && day<=31)) || (month==2 &&  (day>=1 && day<=18))) 
			{	
				System.out.println("Congradulations, your an Aquarius!");
			}
					
			else if((month==2 && (day>=19 && day<=29)) || (month==3 &&  (day>=1 && day<=20))) 
			{	
				System.out.println("Congradulations, your a Pisces!");
			}	
					
			else if((month==3 && (day>=21 && day<=31)) || (month==4 &&  (day>=1 && day<=19))) 
			{	
				System.out.println("Congradulations, your an Aries!");
			}		
		
			else if((month==4 && (day>=20 && day<=30)) || (month==5 &&  (day>=1 && day<=20))) 
			{	
				System.out.println("Congradulations, your a Taurus!");
			}
	
			else if((month==5 && (day>=21 && day<=31)) || (month==6 &&  (day>=1 && day<=20))) 
			{	
				System.out.println("Congradulations, your a Gemini!");
			}			
		
			else if((month==6 && (day>=21 && day<=30)) || (month==7 &&  (day>=1 && day<=22))) 
			{	
				System.out.println("Congradulations, your a Cancer!");
			}		
		
			else if((month==7 && (day>=23 && day<=31)) || (month==8 &&  (day>=1 && day<=22))) 
			{
				System.out.println("Congradulations, your a Leo!");
			}			
		
			else if((month==8 && (day>=23 && day<=31)) || (month==9 &&  (day>=1 && day<=22))) 
			{
				System.out.println("Congradulations, your a Virgo!");
			}			
		
			else if((month==9 && (day>=23 && day<=30)) || (month==10 &&  (day>=1 && day<=22))) 
			{
				System.out.println("Congradulations, your a Libra!");
			}
					
			else if((month==10 && (day>=23 && day<=31)) || (month==11 &&  (day>=1 && day<=21))) 
			{
				System.out.println("Congradulations, your a Scorpio!");
			}			
		
			else if((month==11 && (day>=22 && day<=30)) || (month==12 &&  (day>=1 && day<=21))) 
			{
				System.out.println("Congradulations, your a Sagittarius!");
			}
								
				else
				{
					System.out.println("Invalid Day"); //Flags all non-specified dates as invalid by informing the user when they have entered such dates.
				}
		
		
		System.out.println("Finished!"); //Lets user know the program has ended.
	}
}

