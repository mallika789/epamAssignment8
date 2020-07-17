package epamAssignment8;

import java.util.Scanner;

public class Assignment {
	public static String rem(String string) {
		String res = "";
		if(string.charAt(0) == 'A') {
			
		}
		else {
			res += string.charAt(0);
		}
		if(string.charAt(1) == 'A') {
			
		}
		else {
			res += string.charAt(1);
		}
		res += string.substring(2);
		return res;
	}
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	System.out.println(rem(str));
    }
}
