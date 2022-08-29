

public class xremoved {
	public static void main(String[] args) {
		String a = "xabxxxcdx";
	//	String mod = a.substring(1, a.length() - 1);
	//	String front = a.substring(0);
	//	String end = a.substring(a.length());
	//	System.out.println(mod);
	int size = a.length();
		char temp = ' ';
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			temp = a.charAt(i);
			if((a.charAt(0)!='x') && (a.charAt(size)!='x')){
			if (temp != 'x') {
				result += temp;

			}

		}}
			System.out.println(result);
		}
	
	}


