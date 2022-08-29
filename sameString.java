public class sameString {
	public static void main(String[] args) {
		String a = "xxcaazz";
		String b = "xxbaaz";
		int length = Math.min(a.length(), b.length());
		int count = 0;
		for (int i = 0; i <length-1; i++) {
			String aString = a.substring(i, i + 2);
			String bString = b.substring(i, i + 2);
			if (aString.equals(bString)) {
				count++;
			}

		}
		System.out.println(count);
	}
	

}
