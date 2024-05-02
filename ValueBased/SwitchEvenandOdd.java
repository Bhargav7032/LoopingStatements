package ValueBased;

import java.util.Scanner;

public class SwitchEvenandOdd {
public static void main(String[]args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter Number:");
	int num=scan.nextInt();
	
	//int num=8;
	switch (num%2) {
	case 0:
		System.out.println("Even number");
		break;

	case 1:
		System.out.println("odd number");
		break;
	default:
		break;
	}
}

}
