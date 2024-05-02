package Ifelse;

public class specialcharacter {
public static void main(String[]args) {
	char ch='9';
	if((ch>='a' && ch<='z')||(ch>='A' && ch <='Z')) {
		System.out.println("'%c is alphabet.");
	}
	else if (ch>='0'&& ch<='9'){
		System.out.println("given char is a integer: "+ch);
	}
	else 
	{
	System.out.println("'%c' special character."+ch );	
	
	}
		
	 
}}

