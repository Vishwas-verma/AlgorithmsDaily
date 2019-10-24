/*

Author : ngnishchay191 (Nishchay Gupta)
College : Maharaja Agrasen Institute Of Technology, New Delhi
Year/Department : 2nd Year/CSE
E-Mail Id : ngnishchay191@gmail.com

*/
import java.util.*;

public class missing_number_ngnishchay191 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < n; i++) {
			int temp = scan.nextInt();
			sum = sum + temp;
		}
		
		int sumOfN = ((n+1) * n )/2;
		
		int missing = sumOfN - sum;
		
        System.out.println(missing);
        
        scan.close();		

	}

}
