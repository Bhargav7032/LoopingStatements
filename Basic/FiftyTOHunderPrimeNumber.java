package comForloop.Basic;

public class FiftyTOHunderPrimeNumber {
	public static void main(String[]args) {
		int A,B,C;
		for(A=50;A<100;A++) {
			C = 0;
			for(B=50;B<100;B++) 
			{
		
				if(A%B == 0)
					C = 1;
				break;

			}
				if(C == 0) {
			System.out.println(A);
				}
				
			}
		}
	}
	

			
		
	
