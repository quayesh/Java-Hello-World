package begining;

import java.util.Scanner;

public class Calculation1 {
	//Global Variable
	static String nameOfEmployee;
	static double numberOfHourWorked;
	static double hourlyPayRate;
	static double grossPay;
	static double netPay;
	
	// Module 1
	public static void wellcome()
	{
		System.out.println("******Employee Calculator********");
		System.out.println("please follow the instruction");
	}
	//Module 2
	public static void getinput() {
		Scanner myscanner=new Scanner(System.in);
		System.out.println("Enter employee Name");
		nameOfEmployee=myscanner.nextLine();
		System.out.println("Enter total hour");
		numberOfHourWorked=myscanner.nextDouble();
		System.out.println("Enter hourly rate");
		hourlyPayRate=myscanner.nextDouble();
		
	}
	//Module 3
	public static void process() {
		grossPay=numberOfHourWorked * hourlyPayRate;
	}
	//Module 4
	public static void displayOutput() {
		System.out.println("");
		System.out.println("");
		System.out.println("*******Pay stub*********");
		System.out.println("Employee name is "+ nameOfEmployee);
		System.out.println("Employee total hour is "+ numberOfHourWorked);
		System.out.println("Employee hourly rate is "+ hourlyPayRate);
		System.out.println("****************************************");
		System.out.println("Employee gross pay is " +grossPay);
		System.out.println("Employee net pay is " + netPay);
	}
	public static void grossPay() {
		grossPay=numberOfHourWorked * hourlyPayRate;
		
	}
		public static void netPay() {
			if(grossPay<1500) {
				netPay=grossPay-10;
			}
			else if(grossPay>=1500 && grossPay<3000) {
				netPay=grossPay-20;
			}
			else if(grossPay>=3000 && grossPay<4500) {
				netPay=grossPay-30;
			}
			else if(grossPay>=4500 && grossPay<6000) {
				netPay=grossPay-40;
			}
			else if(grossPay>=6000) {
				netPay=grossPay-50;
			}
			else {
				System.out.println("No idea");
			}
	}
	

	public static void main(String[] args) {
		wellcome();
		getinput();
		grossPay();
		netPay();
		displayOutput();
		

	}

}
