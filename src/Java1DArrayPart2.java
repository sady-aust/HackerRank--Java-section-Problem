import java.util.Scanner;

/*
 * Author
 * Md. Toufiqul Islam
 * Dept. Of CSE
 * Ahsanullah University Of Science And Technology
 * 
 * HackerRank Java 1D array Part 2
 */

public class Java1DArrayPart2 {
   
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int i=0;i<t;i++){
		int count =0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int j=0;j<n;j++){
			a[i] = sc.nextInt();
		}
		
		for(int j=0;j<n;j++){
			if(a[j]==0){
				count =j;
			}
			else if(a[j+m]==0){
				//count =
			}
		}
		
		
	}
		
	}
	

}
