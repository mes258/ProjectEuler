
public class Problem2 {
	
	public static void main(String[]args){
		int sum =0;
		int a=1;
		int b=1;
		while(b<4000000){
			if (b%2==0){
				sum += b;
			}
			int temp = a;
			a = b;
			b= a+temp;
		}
		System.out.print(sum);
	}
}
