package ValueBased;

public class IntchangetoArrey {
	public static void main(String[] args)
	{
	    int num = 1234567;
	    int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
	    for(int p : digits) {
	        System.out.print(p);
	    
	}
	System.out.println("frist digit :"+digits[0]);
	System.out.println("last index  :"+digits[6]);

	//System.out.println("last digit:"+digits[digits.length-1]);
	}
	}
