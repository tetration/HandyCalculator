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

class PercentMenu{
	static Scanner in=new Scanner(System.in);
	static int loop= -1;
	public static void percentmenu (){
		System.out.println("\n"+
			  			"========================================\n"+
    					"|      Percentage Calculations          |\n"+
    					"|           Menu                        |\n"+
    					"========================================\n"+
    					"| Options:                             |\n"+
    					"|        0. Return to MainMenu         |\n"+
    					"|1. Add a percentual value to a decimal|\n"+ 
    					"|				or integer value        |\n"+
    					"|				                        |\n"+
    					"|2. Subtract a percentual value to a   |\n"+ 
    					"|	a decimal or integer value          |\n"+
    					"|				                        |\n"+
    					"|3 = Multiply a percentual value to a  |\n"+
    					"| decimal or integer value             |\n"+
    					"|				                        |\n"+
    					"|4 = Divide a percentual value to a    |\n"+
    					"| decimal or integer value             |\n"+
    					"|				                        |\n"+
    					"| 5 = Not implemented yet              |\n"+
    					"|                                      |\n"+
    					"========================================\n"+
    					"Select an Option by typing the correct Number:\n");
			try {
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
   				case 1:
   					System.out.println("Going to Adding a percentual value to a number tool... ");
   					PercentCalc.percentualsum();
   					break;

   				case 2:
   					System.out.println("Going to subtracting a percentual value to a number tool... ");
   					PercentCalc.percentsubtraction();
   					break;

   				case 3:
   					System.out.println("Going to multiplying a percentual value to a number tool... ");
   					PercentCalc.percentmultiplication();
   					break;

   				case 4:
   					System.out.println("Going to dividing a percentual value to a number tool... ");
   					PercentCalc.percentdivision();
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

class PercentCalc{
	static Scanner in=new Scanner(System.in);
	public static void percentualsum () {
		System.out.println("Type the number");
		try
		{
			double num=in.nextDouble();
			System.out.println("Now type how much you want to add to it in percent");
			double percent=in.nextDouble();
			double conversion= (num*percent)/100;
			double result=num +conversion;
			System.out.println("You wanted to add " + percent + "% " +" which results in adding " + conversion + " to " +num+ "\n" +
			"which is equal to: " + result);
		}
		catch(InputMismatchException inputmistatchexception){
			System.out.println("Error: Invalid Character. Please type a valid number");
			in.nextLine();
		}
		catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
			in.nextLine();
		}
		finally{
			System.out.println("Would you like to do another operation?\n"+
				"1-Yes \t 2-No(Returns to Percentage Menu)");
			try{
				int choice=in.nextInt();
				switch(choice){
					case 1:
						percentualsum();
						break;

					case 2:
						PercentMenu.percentmenu();
						break;
					
					default:
					System.out.println("Invalid option! Please choose 1 or 2");
					break;
				}

			}
			catch(InputMismatchException inputmistatchexception){
				System.out.println("Error: Invalid Character. Please type a valid number");
				in.nextLine();
				}
			catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
				in.nextLine();
			}
			finally{
				BasicAlgebraMENU.basicalgemenu();
			}
			
		}
	}

	public static void percentsubtraction () {
		System.out.println("Type the number");
		try
		{
			double num=in.nextDouble();
			System.out.println("Now type how much you want to Subtract to it in percent");
			double percent=in.nextDouble();
			double conversion= (num*percent)/100;
			double result=num - conversion;
			System.out.println("You wanted to subtract " + percent + "% " +" which results in subtracting " + conversion + " to " +num+ "\n" +
			"which is equal to: " + result);
		}
		catch(InputMismatchException inputmistatchexception){
			System.out.println("Error: Invalid Character. Please type a valid number");
			in.nextLine();
		}
		catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
			in.nextLine();
		}
		finally{
			System.out.println("Would you like to do another operation?\n"+
				"1-Yes \t 2-No(Returns to Percentage Menu)");
			try{
				int choice=in.nextInt();
				switch(choice){
					case 1:
						percentsubtraction();
						break;

					case 2:
						PercentMenu.percentmenu();
						break;
					
					default:
					System.out.println("Invalid option! Please choose 1 or 2");
					break;
				}

			}
			catch(InputMismatchException inputmistatchexception){
				System.out.println("Error: Invalid Character. Please type a valid number");
				in.nextLine();
				}
			catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
				in.nextLine();
			}
			finally{
				BasicAlgebraMENU.basicalgemenu();
			}
			
		}
	}
	public static void percentmultiplication () {
		System.out.println("Type the number");
		try
		{
			double num=in.nextDouble();
			System.out.println("Now type how much you want to multiply to it in percent");
			double percent=in.nextDouble();
			double conversion= (num*percent)/100;
			double result=num * conversion;
			System.out.println("You wanted to multiply " + percent + "% " +" which results in multiplicating " + conversion + " to " +num+ "\n" +
			"which is equal to: " + result);
		}
		catch(InputMismatchException inputmistatchexception){
			System.out.println("Error: Invalid Character. Please type a valid number");
			in.nextLine();
		}
		catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
			in.nextLine();
		}
		finally{
			System.out.println("Would you like to do another operation?\n"+
				"1-Yes \t 2-No(Returns to Percentage Menu)");
			try{
				int choice=in.nextInt();
				switch(choice){
					case 1:
						percentmultiplication();
						break;

					case 2:
						PercentMenu.percentmenu();
						break;
					
					default:
					System.out.println("Invalid option! Please choose 1 or 2");
					break;
				}

			}
			catch(InputMismatchException inputmistatchexception){
				System.out.println("Error: Invalid Character. Please type a valid number");
				in.nextLine();
				}
			catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
				in.nextLine();
			}
			finally{
				BasicAlgebraMENU.basicalgemenu();
			}
			
		}
	}
	public static void percentdivision () {
		System.out.println("Type the number");
		try
		{
			double num=in.nextDouble();
			System.out.println("Now type how much you want to divide to it in percent");
			double percent=in.nextDouble();
			double conversion= (num*percent)/100;
			double result=num / conversion;
			System.out.println("You wanted to divide " + percent + "% " +" which results in dividing " + conversion + " to " +num+ "\n" +
			"which is equal to: " + result);
		}
		catch(InputMismatchException inputmistatchexception){
			System.out.println("Error: Invalid Character. Please type a valid number");
			in.nextLine();
		}
		catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
			in.nextLine();
		}
		finally{
			System.out.println("Would you like to do another operation?\n"+
				"1-Yes \t 2-No(Returns to Percentage Menu)");
			try{
				int choice=in.nextInt();
				switch(choice){
					case 1:
						percentdivision();
						break;

					case 2:
						PercentMenu.percentmenu();
						break;
					
					default:
					System.out.println("Invalid option! Please choose 1 or 2");
					break;
				}

			}
			catch(InputMismatchException inputmistatchexception){
				System.out.println("Error: Invalid Character. Please type a valid number");
				in.nextLine();
				}
			catch(ArithmeticException inputarithmeticexception){
			System.out.println("Error: Invalid type of number. Please type a valid number");
				in.nextLine();
			}
			finally{
				BasicAlgebraMENU.basicalgemenu();
			}
			
		}
	}
}