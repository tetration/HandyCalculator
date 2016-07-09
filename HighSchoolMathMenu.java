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
class HighSchoolMathMenu{
	static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void hsmathmenu() {
		while (loop != 0) {
			System.out.println("High School Math Menu\n"+
			"What would you like to do today sir? \n"+
			"0 = Return to mainmenu\n"+
			"1 = Basic Algebra \n"+
			"2 = Geometry\n"+
			"3 = Trigonometry\n"+
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
					System.out.println("Going Back....\n"+
					"Thanks for using hsmathmenu!");
					MainMenu.mainmenu();
					break;

				case 1:
					BasicAlgebraMENU.basicalgemenu();
					break;

				case 2:
					System.out.println("Loading High School Geometry Menu...");
					HSGEOMenu.hsgeomenu();
					break;
				
				default:
					System.out.println("Error: Nonexistant Option. Try again!");
					break;   
			}
		}
	}
}
