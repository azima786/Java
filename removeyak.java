/**
 * removeyak
 */
public class removeyak {

	public static void main(String[] args) {
		// 
//Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


//stringYak("yakpak") → "pak"
//stringYak("pakyak") → "pak"
//stringYak("yak123ya") → "123ya"

String str = "yakpak";
String temp = "";
if (str.contains("yak")) {
temp =str.replace("yak", "");
}

System.out.println(temp);

}
}