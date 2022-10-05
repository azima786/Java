public class doubleChar {
    public static void main(String[] args) {
// Given a string, return a string where for every char in the original, there are two chars.

// doubleChar("The") → "TThhee"
// doubleChar("AAbb") → "AAAAbbbb"
// doubleChar("Hi-There") → "HHii--TThheerree"
String str = "The";
String res = "";
char[] a = str.toCharArray();

for(char ab: a){
res = res+ab+ab;
System.out.println(res);
}


  
}


    }

