package Starpatterns;

public class Starpatterns004 {
	public static void main(String []args) {
		int num = 5;

        for (int i = 0; i  <  num; i++) {
            for (int j = num - 1; j  >  i; j--) {
                System.out.print(" ");
            }         
            if (i == 0||i == num-1) {
                for (int k =0; k<= i; k++) {
                System.out.print("* ");
                }
            } else {
                System.out.print("*");
                for (int k= 1; k<i; k++) {
                    System.out.print("  ");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

			
	
