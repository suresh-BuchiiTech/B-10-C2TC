package list_of_programs;

import java.util.Scanner;
public class ArmstrongNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any Number");
			int num=sc.nextInt();
			boolean res=checkArmstrongNumber(num);
			if(res) {
				System.out.println(num+" is Armstrong Number");
			}
			else {
				System.out.println(num+" is not Armstrong Number");
			}
		}
		
		private static boolean checkArmstrongNumber(int num) {
			String numStr=Integer.toString(num);
			int count=0,n;
			for(int i=0;i<=numStr.length()-1;i++) {
				n=Integer.parseInt(String.valueOf(numStr.charAt(i)));
				count+=n*n*n;
			}
			if(count==num) {
				return true;
			}else {
				return false;
			}		
		}


}
