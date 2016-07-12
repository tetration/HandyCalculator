import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

class CollegeCalcMenu{
static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void ccalcmenu() {
		System.out.println("\n"+
			  			"========================================\n"+
    					"|      College Calculus Menu            |\n"+
    					"========================================\n"+
    					"| Options:                             |\n"+
    					"| 0. Return to MainMenu                |\n"+
    					"|				                        |\n"+
    					"| 1.  Calculus I                       |\n"+ 
    					"|				                        |\n"+
    					"|				                        |\n"+
    					"| 2.  Calculus II                      |\n"+ 
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 3 =  Calculus III                    |\n"+
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 4 =  Calculus IV                     |\n"+
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 5 = Not implemented yet              |\n"+
    					"|                                      |\n"+
    					"========================================\n"+
    					"Select an Option by typing the correct Number:\n");
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
					System.out.println("Going to Calculus I Menu...");
					CalcMenu.calcmenu();
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