public class countcode {
    public static void main(String[] args) {
        
// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

// countCode("aaacodebbb") → 1
// countCode("codexxcode") → 2
// countCode("cozexxcope") → 2

String str = "cozexxcope";
int count = 0;
String start = "";
String end = "";

    char[] a = str.toCharArray();

    for (int i = 0; i < a.length - 3; i++) {
      
        start = str.substring(i, i+2);
        end = str.substring(i+3, i+4);

        if ((start.equals("co")) && end.equals("e")) {
         count++;
        }
      }    System.out.println(count);
    }

    }

