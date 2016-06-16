/*
Exhibit A - Source Code Form License Notice
-------------------------------------------

Copyright {2016} {Tetration - Rafael Augusto Oliveira}

  This Source Code Form is subject to the terms of the Mozilla Public
  License, v. 2.0. If a copy of the MPL was not distributed with this
  file, You can obtain one at http://mozilla.org/MPL/2.0/.

If it is not possible or desirable to put the notice in a particular
file, then You may include the notice in a location (such as a LICENSE
file in a relevant directory) where a recipient would be likely to look
for such a notice.

You may add additional accurate notices of copyright ownership.

Exhibit B - "Incompatible With Secondary Licenses" Notice
---------------------------------------------------------

  This Source Code Form is "Incompatible With Secondary Licenses", as
  defined by the Mozilla Public License, v. 2.0.
*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
public class HandyCalculator {
	public static void main(String[] args) {
	System.out.println("The Handy Calculator \n"+
		"helping high school and college students with their Math-related classes since 2016");
		MainMenu.mainmenu();
	}

}
class MainMenu{
	static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void mainmenu() {
		while (loop != 0) {
			System.out.println("What would you like to do today sir?\n"+
			"0 = Quit program\n"+
			"1 = High School Math \n"+
			"2 = College Analytic Geometry\n"+
			"3 = College Calculus\n"+
			"4 = Carrega dados em um arquivo txt");
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
					System.out.println("Shutting down....\n"+
					"Thanks for using the HandyCalculator!");
					break;

				case 1:
					HighSchoolMathMenu.hsmathmenu();
					break;

				case 2:
					System.out.println("Not Implemented yet");
					break;

				case 3:
					System.out.println("Going to College Calculus Menu...");
					CollegeCalcMenu.ccalcmenu();
					break;
				
				default:
					System.out.println("Erro: Nonexistent option. Try again!");
					break;   
			}
		}
	}
}
