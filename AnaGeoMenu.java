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
class AnaGeoMenu{
	static Scanner in=new Scanner(System.in);
	static int loop= -1;
	public static void anageomenu (){
		while (loop!=0) {
			System.out.println("Analytic Geometry Menu: \n"+
			"What would you like to do?\n"+
			" 0- Return to Mainmenu\n"+
			"01- Cartesian coordinate system \n"+
			"02- Cartesian coordinate system \n"+
			"03- \n"+
			"04- \n"+
			"05-");
			try {
				System.out.println("something");
				loop=in.nextInt();
			}
			catch(InputMismatchException inputmistatchexception){
   				System.out.println("Error: Invalid Character. Please type a valid number");
				in.nextLine();

   			}
   			catch(ArithmeticException arithmeticException){
   				System.out.println("Error: Invalid type of number. Please type a valid number");
				in.nextLine();
   			}
   			switch (loop) {
   				case 0:
   					System.out.println("Returning to MainMenu...");
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

   				case 4:
   					System.out.println("Not Implemented yet");
   					break;

   				case 5:
   					System.out.println("Not Implemented yet");
   					break;

   				default:
   				System.out.println("Erro: Nonexistent option. Try again!");
					break;

   				}
		}

	}
}