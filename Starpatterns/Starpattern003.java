package Starpatterns;

public class Starpattern003 {
public static void main(String[]args) {
	int num=7;
	 for (int i = 0; i  <  num; i++) {
         for (int j = 0; j  <  num; j++) {
             if (i == num / 2 || j == num / 2) {
                 System.out.print("*");
             } else {
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
 }

}

