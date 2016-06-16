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
			"1 = sum operation \n"+
			"2 = subtract operation \n"+
			"3 = 2 number multiplication\n"+
			"4 = 2 number division\n"+
			"5 = Quadratic Equations Solver");
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
					"Thanks for using Basic Algebra Menu!");
					MainMenu.mainmenu();
					break;

				case 1:
					System.out.println("numbers Sum operation");
					BasicAlgebra.sum();
					break;

				case 2:
					System.out.println("numbers subtraction");
					BasicAlgebra.subtraction();
					break;

				case 3:
					System.out.println("2 numbers multiplication");
					BasicAlgebra.multiply();
					break;

				case 4:
					System.out.println("2 numbers division");
					BasicAlgebra.division();
				case 5:
					System.out.println("Quadratic Equations");
					BasicAlgebra.basicquadequation();
				
				default:
					System.out.println("Error: not avaliable"); 
					break;  
			}
		}
	}
}
class BasicAlgebra{
	static Scanner in=new Scanner(System.in);
	public static void sum (){
		try{
		int z=NumberStorage.setarraylength();
		double m[]=NumberStorage.setarraynumbers(z);
		double sum=0;
		for (int i=0;i<z ;i++ ) {
			System.out.println(m[i]);
		}
		for (int i=0;i<m.length ;i++ ) {
			sum= sum + m[i];	
		}
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
	public static void subtraction (){
		try{
		System.out.println("Type how many numbers in a row you want to subtract in this operation\n"+
		"(The first number will be the number that will get subtracted by the others)");
		int z= NumberStorage.setarraylength();
		double m[]=NumberStorage.setarraynumbers(z);
		double subtract=0;
		double first=m[0];
		System.out.println("Numbers typed: ");
		for (int i=0;i<z ;i++ ) {
			System.out.println(m[i]);
		}
		for (int i=1;i<m.length ;i++ ) {
			subtract= subtract + m[i];	
		}
		System.out.println("Result:"+ (first - subtract) );
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
		System.out.println("Multiplicator: ");
		int z=NumberStorage.setarraylength();
		double nums[]=NumberStorage.setarraynumbers(z);
		double result=nums[0];
		for (int i=1;i<nums.length;i++) {
			result=result*nums[i];
		}
		
		System.out.println("Result of the multiplication: \n"+ result);
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
			System.out.println("Division: ");
			int n=NumberStorage.setarraylength();
			System.out.println("WARNING:\nThe first Number that you type will be the one \n divided by the others");
			double nums[]=NumberStorage.setarraynumbers(n);
			double division=nums[0];
			double remainder=nums[0];
			System.out.println("After dividing " + nums[0]+" by the numbers below \n");
			for (int i=1;i<nums.length;i++ ) {
				division=division/nums[i];
				remainder=remainder/nums[i];
				System.out.println(nums[i]+" \t");
		}

			System.out.println("\n We were left with this division result: "+ division + " remainder: "+ remainder);
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
	public static void  basicquadequation () {
			System.out.println("Simple Quadratic Equation Solver\n"+
   			"Ax(or Ay)^2 + By(or Bx) + C= 0\n"+
   			"Type the A of the equation, in case it is null(nonexistant) type 0 \n"+
   			"Atenção!Cuidado pois quando ele não aparece não significa que ele e zero \n"+
   			"Ex: X + 2X + 9=0, podemos notar nessa equação de primeiro grau que ele não aparece \n"+
   			"Oque significa que o A equivale a 1.(Seguir o mesmo racíocinio ao colocar o valor de B)");

			try{
   				double a= in.nextDouble();// Guarda o valor escolhido pelo user em a
   				System.out.println(" Agora Digite o B da equação, caso ele não exista coloque 0");
   				double b= in.nextDouble();// Guarda o valor escolhido pelo user em b
   				System.out.println("Agora o C da equação, caso ele não exista coloque 0");
   				double c= in.nextDouble();// Guarda o valor escolhido pelo user em c
   				double Delta= b*b -4*(a * c);// Faz o calculo necessário para descobrir o delta
   				double solucao  = (-b + Math.sqrt(Delta))/2*a;// calcula a solução 1 é guarda o valor na var solucao
   				double solucao2 = (-b - Math.sqrt(Delta))/2*a;// calcula a solução 2 é guarda o valor na var solucao2
   				System.out.println("Sua Equação de 2 Grau resultou em:");
   				if (Delta>0) {
      				System.out.println("a equação tem duas raízes reais diferentes, pois seu Delta é maior que 0, \n"+
      				" elas são as soluções: ");
      
   					}// if end
   				if (Delta==0) {
      				System.out.println("a equação tem duas raízes reais iguais, pois seu Delta é igual a zero,\n"+
     				", que são: ");
   					}// fim do else if
   
   				else if (Delta<0) {
      					System.out.println("a equação não tem raízes reais. Pois seu Delta é menor que zero.");

   				}// fim do else if
   				System.out.println("Solution 1: " + solucao+" \n"+// Mostra a solução 1 ao user
   				"Solution 2: " + solucao2);// Mostra a solução 2 ao user

   			}
   			catch(InputMismatchException inputmistatchexception){
   				System.out.println("Error: Invalid Character. Please type a valid number");
				in.nextLine();

   			}
   			catch(ArithmeticException arithmeticException){
   				System.out.println("Error: Invalid type of number. Please type a valid number");
				in.nextLine();
   			}
   			finally{
				System.out.println("Would you like to do another Equation?\n"+
				"1-Yes \t 2-No(Returns to Basic Algebraic Menu)");
				try{
					int choice=in.nextInt();
					switch(choice){
						case 1:
							basicquadequation();
							break;

						case 2:
							BasicAlgebraMENU.basicalgemenu();
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

