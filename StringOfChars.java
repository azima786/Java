public class StringOfChars {
	public static void main(String[] args) {

String str = "Chocolate";
String result = "";


for(int i=0; i<str.length(); i+=4){

result = result+str.substring(i,Math.min(str.length(), i+2));

}
System.out.println(result);
	}
}