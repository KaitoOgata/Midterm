import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
    	int count = 1;
    	for (int i = 1; i <= 6; i++ ) {
    		int number = 1;
        
    		Random random = new Random();
    		int randomvalue = random.nextInt(2);
        

    		while (randomvalue != number) {
    			randomvalue = random.nextInt(2);
    			count++;
    		}
    	}
        
        System.out.println("number of falls: " + 
                           count);
    }
}
