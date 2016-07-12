import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
class HSGEOMenu {
	static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void hsgeomenu(){
			System.out.println("\n"+
			  			"========================================\n"+
    					"|      Analytic Geometry Menu          |\n"+
    					"========================================\n"+
    					"| Options:                             |\n"+
    					"| 0. Return to High School Math Menu   |\n"+
    					"|				                        |\n"+
    					"| 1.  Trigonometry                     |\n"+ 
    					"|				                        |\n"+
    					"|				                        |\n"+
    					"| 2.  Nothing yet                      |\n"+ 
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 3 = Nothing yet                      |\n"+
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 4 =  Nothing yet                     |\n"+
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 5 = Nothing yet                      |\n"+
    					"|                                      |\n"+
    					"========================================\n"+
    					"Select an Option by typing the correct Number:\n");

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
					System.out.println("Going Back to High School Math Menu....\n"+
					"Thanks for using High School Geometry Menu!");
					HighSchoolMathMenu.hsmathmenu();
					break;

				case 1:
					System.out.println("Going to Trigonometry Menu");
					TrigonoMenu.trigonomenu();
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
