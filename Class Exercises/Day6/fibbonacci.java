package Day6;

import java.util.Scanner;

public class fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value ofn");
		int n=s.nextInt();
		System.out.println("fibbonacci series of elemnts");
		for(int i=1;i<=n;i++) {
			System.out.println(fibbonacci(i));
		}
		System.out.println("fibonacci of nth number is"+fibbonacci(n));
   }
	public static int fibbonacci(int n) {
		if(n<=0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return fibbonacci(n-1)+fibbonacci(n-1);
		}
	}

}
