import javax.lang.model.util.ElementScanner6;
import javax.sound.midi.Soundbank;

public class endOther {

  public static void main(String[] args) {
    // Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

    // endOther("Hiabc", "abc") → true
    // endOther("AbC", "HiaBc") → true
    // endOther("abc", "abXabc") → true

    String a = "Hiabcx";
    String b = "abc";

    String aLower = a.toLowerCase();
    String bLower = b.toLowerCase();

    if (aLower.endsWith(bLower)) {
      System.out.println(true);
    } else if (bLower.endsWith(aLower)) {
      System.out.println(true);
    }
    else System.out.println(false);
  } 
}
