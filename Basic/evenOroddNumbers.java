package comForloop.Basic;

public class evenOroddNumbers {

		public static void main(String[] args) {
			int count =0;
			long l=12;
			for(int i=1;i<=l/2;i++) {
				if (l%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("it is a prime number");
			}else {
				System.out.println("it is not a prime number");
			}
		}

	}

