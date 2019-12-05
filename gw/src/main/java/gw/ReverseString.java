package gw;

public class ReverseString {

	public static void main(String[] args) {
	
	String s = "Reverse";
	char[] str = s.toCharArray();
	System.out.println(str.length);
		
	String rev="";
	
	for(int i=str.length-1; i>=0; i--)
	{
		rev = rev + str[i];	
	}
	System.out.println("Reverse is:" + rev);
	
	}
}
