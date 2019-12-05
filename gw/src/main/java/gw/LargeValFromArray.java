package gw;

public final class LargeValFromArray {

	public static void main(String[] args) {
		
		int[] arr = {56,7,9,34,87,12};
		
		int val = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]>val)
				val = arr[i];			
			
		}
		
		System.out.println("Large value from array is:"+val);
	}
}
