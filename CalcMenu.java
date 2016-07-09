import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

class CalcMenu{
static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void calcmenu() {
		while (loop != 0) {
			System.out.println("Calculus 1 Menu \n What would you like to do today sir?\n"+
			"0 = Return to College Calculus Menu\n"+
			"1 = Not implemented yet\n"+
			"2 = Not implemented yet\n"+
			"3 = Not implemented yet\n"+
			"4 = Not implemented yet");
			try{
				loop = in.nextInt();
			}
			
			catch(InputMismatchException  inputmistatchexception) {
				System.out.println("Error: Invalid char! Try again!");
				in.nextLine();
			}

			catch (ArithmeticException arithmeticException) {
				System.out.println("Invalid value try again!");
				in.nextLine();
			}

			switch(loop){
				case 0:
					System.out.println("Going Back to College Calculus Menu....\n"+
					"Thanks for using Calculus 1 Menu!");
					CollegeCalcMenu.ccalcmenu();
					break;

				case 1:
					System.out.println("Not Implemented yet");
					break;

				case 2:
					System.out.println("Not Implemented yet");
					break;

				case 3:
					System.out.println("Not Implemented yet");
					break;
				
				default:
					System.out.println("Error: not avaliable"); 
					break;  
			}
		}
	}
}