public class countx {
	public static void main(String[] args) {
		String str = "xxxxaavx";
		int count = 0;
		for (int i = 0; i <str.length()-1; i++) {
			if (str.substring(i, i + 2).equals("xx")) {
				count++;
			}

		}
			System.out.println(count);
		}
	}

