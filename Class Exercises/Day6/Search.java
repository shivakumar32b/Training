package Day6;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter target vakue");
		int target=s.nextInt();
		System.out.println("enter array elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		
					if(a[i]==target) {
				System.out.println("element found at location"+i);
			}
			else {
				System.out.println("element not found"+(-1));
			}
		}
			
		}

	}


