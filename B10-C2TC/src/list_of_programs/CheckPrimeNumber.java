package list_of_programs;
import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		boolean check=checkPrime(num);
		System.out.println(check);
	}
	
	private static boolean checkPrime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
