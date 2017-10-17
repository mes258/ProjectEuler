
public class Problem7 {
	public static void main(String[]args){
		int num = 0;
		int val = 0;
	
		for (int n = 1; n < 100000000; n++) {
	        boolean prime = true;
	
	        for (int j = 2; j < n; j++) {
	            if (n % j == 0) {
	                prime = false;
	                break; 
	            }
	        }
	        if(prime && n!=1){
	        	num++;
	        }
	        if(num==10001){
	        	val = n;
	        	break;
	        }
		}
		System.out.println(val);
	}
}
