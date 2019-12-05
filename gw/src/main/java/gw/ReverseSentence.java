package gw;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String sentence = "I want to repeat";
		
		String[] sent = sentence.split(" ");
		
		String rev="";
		
		for(int i = sent.length-1; i>=0; i--)
		{
			
			rev = rev + sent[i]+" ";
		}
		
		System.out.println("Required string is:" + rev);		
		
	}

}
