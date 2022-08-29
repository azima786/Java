public class length2 {
		public static void main(String[] args) {
		String str = "axxxaaxx";
		int count = 0;

		String end = str.substring(str.length() - 2);
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);	
				if(sub.equals(end)){
					count++;
				}
			}
			System.out.println(count);
		}
	
	}


