package guidewire;

import org.testng.annotations.Test;

public class SampleProgram {


	@Test()
	
	public void Sample()
	{
		        int rows = 5;
		        for(int i = 1; i <= rows; i++) {
		            for(int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }
		        
		    }
}
