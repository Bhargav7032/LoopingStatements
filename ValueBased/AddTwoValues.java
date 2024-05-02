package ValueBased;

import java.io.InputStream;
import java.util.Scanner;

public class AddTwoValues {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter frist Number:");
	int a=scan.nextInt();
	
	System.out.println("Enter Secound number:");
	int b=scan.nextInt();
	System.out.println("Seleted opparation");
    char ch = scan.next().charAt(0);

switch (ch) {
case 'a' :
    System.out.println("Sum of the given two numbers: "+(a+b));
    break;
case 'b' :
    System.out.println("Sub of the given two numbers: "+(a-b));
    break;
case 'c' :
    System.out.println("mul of the given two numbers: "+(a*b));
    break;
case 'd':
    System.out.println("div of the given two numbers: "+(a/b));
    break;
default:
	System.err.println("invaild code");
	break;
}
	
	}

}