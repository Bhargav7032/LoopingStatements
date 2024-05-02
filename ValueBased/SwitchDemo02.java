package ValueBased;

import java.util.Scanner;

public class SwitchDemo02 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter frist number");
		int i=scan.nextInt();
		System.out.println("Enter Secound number");
		int j=scan.nextInt();
		System.out.println("Seleted Opparations");
		char ch=scan.next().charAt(0);
		switch (ch) {
		case 'a':
		    System.out.println("Sum of the given two numbers: "+(i+j));
		    break;
		case 'b':
		    System.out.println("Sum of the given two numbers: "+(i-j));
		    break;
		case 'c':
			System.out.println("Sum of the given two numbers:"+(i*j));
			break;
		default:
			System.err.println("invaild Selected");
			break;
		}
	}

}
