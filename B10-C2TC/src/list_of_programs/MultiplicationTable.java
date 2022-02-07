package list_of_programs;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(int i=1;i<=20;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}

	}

}
