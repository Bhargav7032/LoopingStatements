package ValueBased;

import java.util.Scanner;

public class SwitchDemo2 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
	
	 while(true) {
	     System.out.println("Next fruit:");
	
	    String fruit=scan.nextLine();
  
	
		switch (fruit) {
		case "mango":
			System.out.println("i am yellow colour");
			break;

		case "Apple":
			System.out.println("i am Red colour");
			break;

		case "kacha mango":
			System.out.println("i am green colour");
			break;

		default:
			System.err.println("invild fruit");
			break;
		}
	  }
}

}
