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
class BasicAlgebraMENU{
	static Scanner in=new Scanner(System.in);
	static int loop = -1;
	public static void basicalgemenu() {
		while (loop != 0) {
			System.out.println("What would you like to do today sir?\n"+
			"0 = Return to HighSchool math menu\n"+
			"1 = 2 number sum operation \n"+
			"2 = 2 number multiplication\n"+
			"3 = 2 number division\n"+
			"4 = TEST");
			try{
				loop = in.nextInt();
			}
			
			catch(InputMismatchException  inputmistatchexception) {
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
					"Thanks for using Basic Algebra Menu!");
					MainMenu.mainmenu();
					break;

				case 1:
					System.out.println("2 numbers Sum operation");
					BasicAlgebra.sum();
					break;

				case 2:
					System.out.println("2 numbers multiplication");
					BasicAlgebra.multiply();
					break;

				case 3:
					System.out.println("2 numbers division");
					BasicAlgebra.division();
				
				default:
					System.out.println("Erro: opcao inexistente"); 
					break;  
			}
		}
	}
}
class BasicAlgebra{
	static Scanner in=new Scanner(System.in);
	public static void sum (){
		try{
		System.out.println("Write a number");
		double n=in.nextDouble();
		System.out.println("Write another number");
		double n2=in.nextDouble();
		double sum= n + n2;
		System.out.println("Result:"+ sum);
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
				"1-Yes \t 2-No(Returns to Basic Algebra Menu)");
			try{
				int choice=in.nextInt();
				switch(choice){
					case 1:
						sum();
					break;
					case 2:BasicAlgebraMENU.basicalgemenu();
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
	public static void multiply (){
		try{
		System.out.println("Multiplicator: \n"+
			"Write a number");
		double z=in.nextDouble();
		System.out.println("Write another number");
		double z2=in.nextDouble();
		double multiply= z * z2;
		System.out.println("Result:"+ multiply);
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
				"1-Yes \t 2-No(Returns to Basic Algebra Menu)");
			try{
				int choice=in.nextInt();
				switch(choice){
					case 1:
						multiply();
					break;
					case 2:BasicAlgebraMENU.basicalgemenu();
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
	public static void division (){
		try{
		System.out.println("Write a number");
		double n=in.nextDouble();
		System.out.println("Write another number");
		double n2=in.nextDouble();
		double division= n / n2;
		double leaves= n % n2;
		System.out.println("Result:"+ division + "remainder: "+ leaves);
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
				"1-Yes \t 2-No(Returns to Basic Algebra Menu)");
			try{
				int choice=in.nextInt();
				switch(choice){
					case 1:
						division();
					break;
					case 2:BasicAlgebraMENU.basicalgemenu();
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