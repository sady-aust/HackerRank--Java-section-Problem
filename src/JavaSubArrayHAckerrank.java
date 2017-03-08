

import java.util.Scanner;

public class JavaSubArrayHAckerrank {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int total=0;
		
		for(int i=0;i<a.length;i++){
			int sum =0;
			for(int j=i;j<a.length;j++){
				sum+=a[j];
				if (sum<0){
					total++;
				}

			}
					}
		
		System.out.println("TOTAL "+total);
	}

}
