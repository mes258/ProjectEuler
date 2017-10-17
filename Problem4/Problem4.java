
public class Problem4 {
		public static void main(String[]args){
			int max = 0; 
			int c = 0;
			for (int a = 100; a<1000; a++){
				for(int b=100; b<1000; b++){
					c=a*b;
					String s = String.valueOf(c);
					if( s.length()==5){
						if(s.substring(0,1).equals(s.substring(4,5))){
							if(s.substring(1,2).equals(s.substring(3,4))){
								int d = Integer.parseInt(s);
								if(d>max){
									max = d;
								}
							}
						}
					}else if(s.length()==6){
						if(s.substring(0,1).equals(s.substring(5,6))){
							if(s.substring(1,2).equals(s.substring(4,5))){
								if(s.substring(2,3).equals(s.substring(3,4))){
								int d = Integer.parseInt(s);
								if(d>max){
									max = d;
								}
							}
						}
					}	
				}
			}
		}
	System.out.println(max);
	}
}
