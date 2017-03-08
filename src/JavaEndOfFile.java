import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	     
	     int c =0;
	     while(sc.hasNext()){
	    	// System.out.println(++c+" "+sc.nextLine());
             String a = sc.nextLine();
             System.out.println(++c+" "+a);
	     }
     
	}
}
