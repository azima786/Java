

public class questions2 {

	public static void main(String[] args) {
		//String s = "Hello this is AzIMA";
		//String lower = s.toLowerCase();
		//String replace = s.replace(" ", "_");
		String letter = "Dear <|name|>, Thanks alot!";
		letter = letter.replace("<|name|>", "Harry");
		System.out.println(letter);

		String myString = "This String contains    double   and triple";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
	}
	
	String myLetter = "Dear Harry,\n\t This java Course is Nice.\n\t Thanks!";


}
