import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
class TrigonoMenu{
	static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void trigonomenu(){
				while (loop != 0) {
			System.out.println("\n"+        
				"	`-. \n"+
    			"   |  `-.\n"+
    			"   |     /.\n"+
    			"   +.   /  `-.\n"+
    			"   | `-'      `-.\n"+
    			"   |             `-.\n"+
    			"   |                `-.\n"+
    			"   |                   `.\n"+
    			"   |                     `-.\n"+
    			"   |                        `-.\n"+
    			"   |                           `-.\n"+
    			"   |                              `.\n"+
    			"   |                                `-.\n"+
    			"   |                                   `-.\n"+
    			"   |                                      `-.\n"+
    			"   ,_____.                                   `-.\n"+
    			"   |     |                                     ,--\n"+
    			"   |     |                                         `-.\n"+
    			"   --------------------------------------------------`-.\n"+
       			"	(Rigth Triangle)\n"+

				"\n"+
			"High School Trigonometry Menu\n"+
			"What would you like to do today sir? \n"+
			"0 = Return to High School Geometry Math Menu\n"+
			"1 = Trigonometry Mini game \n"+
			"2 = Something else \n" +
			"3 = Something else \n" +
			"4 = Something else");
			try{
				loop = in.nextInt();
			}
			
			catch(InputMismatchException  InputMismatchException) {
				System.out.println("Erro:Char invalido! Tente novamente!");
				in.nextLine();
			}

			catch (ArithmeticException arithmeticException) {
				System.out.println("Valor invalido tente novamente!");
				in.nextLine();
			}

			switch(loop){
				case 0:
					System.out.println("Returning to High School Geometry Menu...");
					HSGEOMenu.hsgeomenu();
					break;

				case 1:
					System.out.println("Going to Trigonometry Mini Game");
					TrigonoAct.triggame();
					break;

				case 2:
					System.out.println("Not implemented yet.");
					break;

				case 3:
					System.out.println("Not implemented yet.");
					break;

				case 4:
					System.out.println("Not implemented yet.");
					break;

				
				default:
					System.out.println("Error: Nonexistant Option. Try again!");
					break;   
			}
		}
	}
}
class TrigonoAct{
	public static void triggame(){
		int right=0;
		int wrong=0;
		int total=0;
		System.out.println("Welcome to the Trig Game!");
	TrigonoMenu.trigonomenu();
	}
}