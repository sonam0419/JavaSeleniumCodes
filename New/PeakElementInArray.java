package New;

public class PeakElementInArray {
	public static void main(String[] args) {
		int[] a = {33, 30, 90, 25, 95};
		int n = a.length;
		if(a[0] >= a[1])
		{
			System.out.println("Peak element is: " +a[0]);
		}
		
		else if(a[n-1] >= a[n-2])
		{
			System.out.println("Peak element is: " +a[n-1]);
		}
	}

}
