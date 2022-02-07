package list_of_programs;
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of strings");
		int num=sc.nextInt();
		sc.nextLine();
		String names[]=new String[num];
		System.out.println("Enter "+num+" names:");
		for (int i=0;i<num;i++)
		{
			names[i]=sc.nextLine();	
		}
		Arrays.sort(names);
		System.out.println("Names in sorted order:"+Arrays.toString(names));
	}
}
