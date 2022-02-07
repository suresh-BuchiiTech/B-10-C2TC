package list_of_programs;
import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character:");
		char character=sc.nextLine().charAt(0);
		if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u') 
		{
			System.out.println(character+" is vowel");			
		}
		else {
			System.out.println(character+" is Consonant");			
		}
	}
}
