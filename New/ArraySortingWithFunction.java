package New;

public class ArraySortingWithFunction {
	public int[] arraySorting() {
		int[] arr = {10, 99, 33, 22, 77};
		int i, j, temp;
		
		for(i=0; i<arr.length-1; i++) {
			for(j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}
}
