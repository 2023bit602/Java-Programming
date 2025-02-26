class Practical10{
	static long factorialRecursive(long number) {
        	if (number < 0) return -1;
        	if (number < 2) return 1;
        	return number * factorialRecursive(number - 1);
    	}
	static long factorialIterative(long number) {
		long startTime = System.nanoTime();
        	if (number < 0) return -1; 
        	if (number < 2) return 1;
        	int factorial = 1;
        	for (; number > 1; ) {
       	   	  factorial *= number--;
        	}
        	long endTime = System.nanoTime();
        	return endTime - startTime;
   	 } 

	public static void main(String args[]){
	
		//Input array generated randomly
	 	long timeAvg = 0, timeTotal = 0;
		long[] arr = new long[50]; 
		for (int i = 0; i < 50; i++){
			arr[i] = System.nanoTime() % 51;
		}
		
		//Factorial using for loop
		for (int i = 0; i < 50; i++){
			timeAvg += factorialIterative(arr[i]);	
		}
		System.out.println("Time taken for iterative approach: "+timeAvg/50);
		
		// Factorial using recursion
		for (int i = 0; i < 50; i++){
			long startTime = System.nanoTime();
			factorialRecursive(arr[i]);
			long endTime = System.nanoTime();
			timeTotal += endTime - startTime;	
		}
		System.out.println("Time taken for recursive approach: "+timeTotal/50);
		
		// Using string concatenation
		String s1 = "";
		long timeTotal2 = 0;
		for (int i = 0; i < 50; i++){
			long startTime = System.nanoTime();
			s1 += arr[i];
			long endTime = System.nanoTime();
			timeTotal2 += endTime - startTime;
		}
		System.out.println("Time taken for string concatenation: "+timeTotal2/50);
		
		// Using string buffer and append
		StringBuffer s2 = new StringBuffer();
		long timeTotal3 = 0;
		for (int i = 0; i < 50; i++){
			long startTime = System.nanoTime();
			s2.append(arr[i]);
			long endTime = System.nanoTime();
			timeTotal3 += endTime - startTime;
		}
		System.out.println("Time taken for string buffer: "+timeTotal3/50);
		
		// Using string builder and append
		StringBuilder s3 = new StringBuilder();
		long timeTotal4 = 0;
		for (int i = 0; i < 50; i++){
			long startTime = System.nanoTime();
			s3.append(arr[i]);
			long endTime = System.nanoTime();
			timeTotal4 += endTime - startTime;
		}
		System.out.println("Time taken for string builder: "+timeTotal4/50);
		
		
	}
}
