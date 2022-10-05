

public class xyzThere {

  public static void main(String[] args) {
    // Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    // xyzThere("abcxyz") → true
    // xyzThere("abc.xyz") → false
    // xyzThere("xyz.abc") → true

//xyzThere1("12.xyz");
xyzThere bob = new xyzThere();
bob.bobThere("abcbob");

  }

  public static boolean xyzThere1(String str) {
    for (int i = 0; i < str.length() - 2; i++) {
      String abc = str.substring(i, i + 3);
      System.out.println(abc);
      if(abc.equals("xyz")){
        if(i==0){
            return true;
        }
        else if(str.charAt(i-1) != '.') {
            return true;
        }}}
    return false;}
      

public boolean bobThere(String str) {

    // Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    for(int i = 0; i < str.length() - 2; i++) {
        if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
            return true;
    }
                
    return false;}}