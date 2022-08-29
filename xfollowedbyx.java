public class xfollowedbyx {
	public static void main(String[] args) {
		String str = "xxxxaavx";

		for (int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i)==('x')){
				if (str.charAt(i + 1) == ('x')) {
					System.out.println(true);
				}
				System.out.println("false");
			}

		}
		System.out.println("false");
	}
}