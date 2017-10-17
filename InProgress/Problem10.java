
public class Problem10 {
	public static void main(String[]args){
		int sum=0;
		boolean prime = true;
		for (int n = 1; n < 2000000; n++) {
	         prime = true;
	        // System.out.println(n);
	        for (int j = 2; j < n; j++) {
	            if (n % j == 0) {
	                prime = false;
	                break; 
	            }
	        }
	        if(prime && n!=1){
	        	//System.out.println(n);
	        	sum += n;
	        }
		}
		System.out.println(sum);
	}
}
