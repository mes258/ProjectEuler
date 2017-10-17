
public class Problem9 {
	public static void main(String[]args){
		int a = 0;
		int b = 0;
		int c = 0;
		for (a =0; a<1001; a++){
			for (b=0; b<1001; b++){
				for (c=0; c<1001; c++){
					if ((((a*a)+(b*b))==(c*c))&&a<b&&b<c){
						if (a+b+c ==1000){
							System.out.println(a);
							System.out.println(b);
							System.out.println(c);
							System.out.println(a*b*c);
						}
					}
				}
			}
		}
				
	}
}
