package list_of_programs;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result,num1,num2;
		System.out.println("Enter any option \n\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		int op=sc.nextInt();
		switch(op) {
			case 1:
				System.out.println("Enter num1");
				num1=sc.nextInt();
				System.out.println("Enter num2");
				num2=sc.nextInt();
				result=num1+num2;
				System.out.println("Addition of "+num1+ " and "+num2+" is "+result);
				break;
			case 2:
				System.out.println("Enter num1");
				num1=sc.nextInt();
				System.out.println("Enter num2");
				num2=sc.nextInt();
				result=num1-num2;
				System.out.println("Substraction of "+num1+ " and "+num2+" is "+result);
				break;
			case 3:
				System.out.println("Enter num1");
				num1=sc.nextInt();
				System.out.println("Enter num2");
				num2=sc.nextInt();
				result=num1*num2;
				System.out.println("Multiplication of "+num1+ " and "+num2+" is "+result);
				break;
			case 4:
				System.out.println("Enter num1");
				num1=sc.nextInt();
				System.out.println("Enter num2");
				num2=sc.nextInt();
				result=num1/num2;
				System.out.println("Division of "+num1+ " and "+num2+" is "+result);
				break;
			default:
				System.out.println("Please enter correct option");
				break;
		}
	}
}
