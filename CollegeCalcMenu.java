import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

class CollegeCalcMenu{
static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void ccalcmenu() {
		while (loop != 0) {
			System.out.println("College Calculus Menu \n What would you like to do today sir?\n"+
			"0 = Return to Mainmenu\n"+
			"1 = Calculus I\n"+
			"2 = Calculus II\n"+
			"3 = Calculus III\n"+
			"4 = Calculus IV");
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
					System.out.println("Going Back....\n"+
					"Thanks for using College Calculus Menu!");
					MainMenu.mainmenu();
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