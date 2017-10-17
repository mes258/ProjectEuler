
public class Problem6 {
	public static void main(String[]args){
		int sum1 = 0;
		int sum2 = 0;
		for(int i =0; i<=100;i++){
			sum1 += i;
		}
		sum1 = sum1*sum1;
		
		for(int j =0; j<=100;j++){
			sum2 += j*j;
			
		}
		int tot = sum1-sum2;
		System.out.println(tot);
	
	}
}
