
public class Problem12 {
	public static void main(String[]args){
		int sum = 0;
		int fact = 0;
		boolean first = true;
		int[] numarr = new int[100000];
		for(int i =1; i<100000; i++){
			numarr[i-1]=sum;
			sum+=i;
		}
		for(int j =1; j<99999; j++){
			fact = 0;
			for(int k = 1; k<=j;k++){
				if(j%k==0){
					fact++;
					//System.out.println(fact);
					
				}
				if (fact > 500 && first == true){
					System.out.println(j);
					System.out.println("This should make it stand out. ");
					first =false;
					break;
				}
			}
		}
		
		
		//Print out the triangle numbers. 
		/*  for(int j =0; j<999; j++){
			System.out.println(numarr[j]);
		}*/
	}
}
