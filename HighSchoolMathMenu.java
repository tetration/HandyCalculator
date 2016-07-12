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
		System.out.println("\n"+
			  			"========================================\n"+
    					"|     High School Math Menu            |\n"+
    					"========================================\n"+
    					"| Options:                             |\n"+
    					"| 0. Return to MainMenu                |\n"+
    					"|				                        |\n"+
    					"| 1.  Basic Algebra Menu               |\n"+ 
    					"|				                        |\n"+
    					"|				                        |\n"+
    					"| 2.  High School Geomtry              |\n"+ 
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 3 = Trigonometry                     |\n"+
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 4 =  Nothing Yet                     |\n"+
    					"|                                      |\n"+
    					"|				                        |\n"+
    					"| 5 = Carrega dados em um arquivo txt  |\n"+
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
