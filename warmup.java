public class warmup {
	public static void main(String[] args) {
		String str = "Chocolate";
		int n = 4;
		
		String temp = "";

		if (str.length() < 3 && n > 0) {
			for (int i = 0; i <= n; i++) {
				temp += str;

			}
		}

		else
			for (int j = 0; j<=n; j++) {
			  	String cut = str.substring(0, 3);
				temp += cut;
			}

		System.out.println(temp);
	}
}