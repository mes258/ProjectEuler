
public class Problem3 {
	public static void main(String[]args){
		Double lprime = 2.0;
		for(Double i =10.0; i<600851475143.0; i++ ){
			for (Double j =2.0; j<i;j++){
				if(i%j==0){
					
				}
				else{
					if(j>lprime){
						lprime=j;
					}
				}
			}
		}
		System.out.println(lprime);
	}
}
