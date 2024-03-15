package New;

public class ParentClass {
	public static void main(String[] args) {
		
		//Numbers from String
		NumFromStringFunc numFunc = new NumFromStringFunc();
		numFunc.numbStr();
		
		//Duplicate Chars in String
		DuplicateCharsInString dupChr = new DuplicateCharsInString();
		dupChr.dupCharString();
				
		//Fibonacci Program
		FibonacciClass fib = new FibonacciClass();
		fib.fibonacci();
		
		//String Reverse Program
		StringReverse sr = new StringReverse();
		sr.reverseFunction();
		
		//Array Searching Program
		ArraySearchingWithFunction arrSearch = new ArraySearchingWithFunction();
		int a = arrSearch.arraySearch();
		if(a<0){
			System.out.println("Item not found");
		}
		else{
			System.out.println("The item found at index: " +a);
		}
		
		//Array Sorting Program
		ArraySortingWithFunction arrSorting = new ArraySortingWithFunction();
		int[] array = arrSorting.arraySorting();
		for(int a1 : array) {
			System.out.print(a1 + ", ");
		}
		
		
	}
}
