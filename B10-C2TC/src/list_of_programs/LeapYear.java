package list_of_programs;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		int year=sc.nextInt();
		if(year%400==0) {
			System.out.println(year+" is leap year");
		}
		else if(year%100==0) {
			System.out.println(year+" is not leap year");
		}
		else if(year%4==0) {
			System.out.println(year+" is leap year");
		}
		else{
			System.out.println(year+" is not leap year");
		}

	}

}
