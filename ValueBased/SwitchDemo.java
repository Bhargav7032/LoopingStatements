package ValueBased;

public class SwitchDemo {
public static void main(String []args) {
	int Days=7;
	switch (Days) {
	case 1:
	System.out.println("monday");
		break;
	
	case 2:
		System.out.println("tuesday");
		break;
	
	case 3:
		System.out.println("wednesday");
		break;
	
	case 4:
		System.out.println("thrusday");
		break;
	
	case 5:
	System.out.println("friday");
	break;
	
	case 6:
		System.out.println("Saturday");
		break;
		
	case 7:
		System.out.println("Sanday");
		break;
	
	default:
		System.err.println("Day invailded");
		break;
	}
}

}
