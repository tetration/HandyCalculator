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

class NumberStorage{
	static Scanner in=new Scanner(System.in);
  public static int setarraylength(){
  System.out.println("Type how many numbers in a row you want to make the operation");
  int m = in.nextInt();
  return m;
  }
	public static double [] setarraynumbers(int length){
		double a[] = new double[length];
		try{
			System.out.println("Now lets type each number");
      		for (int i = 0 ; i <= a.length-1 ; i++ ){
         			System.out.println("Type the number ("+ (i+1) + ") for your operation");
            		a[i]= in.nextDouble();
        	}
        	return a;
    	}
        catch(InputMismatchException inMis){
        		in.nextLine();
        }
        catch (ArithmeticException arithmeticException){
        	in.nextLine();
        }
        finally{
        	System.out.println("Number typing completed!");
        	return a;
    	}
    	
    }
	/*public static double getanumbers(int location){
		double current=a[location];
		return current;
	} (Disabled Method due to not working properly)*/
}