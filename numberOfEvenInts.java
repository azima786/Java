public class numberOfEvenInts {
	public static void main(String[] args) {

//		Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
int [] countEvens= {2, 1, 2, 3, 4}; 

int count = 0;
for (int i = 0; i <= countEvens.length-1; i++) {

	if (countEvens[i] % 2 == 0) {
		count++;
	}
	
}
System.out.println("Total Even " + count);
}
}

