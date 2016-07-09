import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
class HSGEOMenu {
	static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void hsgeomenu(){
		while (loop != 0) {
			System.out.println("High School Geometry Menu\n"+
			"What would you like to do today sir? \n"+
			"0 = Return to High School Math Menu\n"+
			"1 = Trigonometry \n"+
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
}
