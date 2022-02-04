package list_of_programs;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=sc.nextLine();
		boolean res=checkPalindrome(str);
		if(res) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not palindrome");
		}
	}

	private static boolean checkPalindrome(String str) {
		char charArr[]=str.toCharArray();
		char sampleArr[] = new char[charArr.length];
		int j=0;
		for(int i=charArr.length-1;i>=0;--i) {
			sampleArr[j]=charArr[i];
			j++;
		}
		if(str.equals(String.valueOf(sampleArr))) {
			return true;
		}else {
			return false;
		}		
	}

}
