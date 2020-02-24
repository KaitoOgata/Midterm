import java.io.*;
import java.util.Scanner; 
  
public class Problem2 { 
  
		public static boolean isPowerOfTwo(int n) {
		    if(n<=0) 
		        return false;
		 
		    while(n>2){
		        int t = n>>1;
		        int c = t<<1;
		 
		        if(n-c != 0)
		            return false;
		 
		        n = n>>1;
		    }
		 
		    return true;
		}
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int m = console.nextInt();
	System.out.println(isPowerOfTwo(m));
	
}
}
