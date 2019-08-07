package begining;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		double number;
		boolean isValid=false;
		while(isValid==false) {
			try 
			{
				Scanner myscan=new Scanner(System.in);
				System.out.println("Enter the number : \t");
				number=myscan.nextDouble();
				isValid=true;
			}
			catch(Exception e)
			{
			System.out.println("Invalid Data !!! pls enter only number");	
			}
		}
        System.out.println("Next");
	}

}
