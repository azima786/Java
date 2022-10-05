public class countHI {

  public static void main(String[] args) {
    // Return the number of times that the string "hi" appears anywhere in the given string.

    // countHi("abc hi ho") → 1
    // countHi("ABChi hi") → 2
    // countHi("hihi") → 2

    String str = "abc hi hi HI ho";
    String res = "";
    char[] a = str.toCharArray();
    int count = 0;

    for (int i = 0; i < a.length - 1; i++) {
      
        res = ""+a[i] + a[i+1];

        if (res.equalsIgnoreCase("hi")) {
          count++;
        }
      }    System.out.println(count);
    }

  }

