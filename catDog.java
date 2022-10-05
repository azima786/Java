public class catDog {

  public static void main(String[] args) {
    // Return true if the string "cat" and "dog" appear the same number of times in the given string.

    // catDog("catdog") → true
    // catDog("catcat") → false
    // catDog("1cat1cadodog") → true

    String str = "catcat";
    int countCat = 0;
    int countDog = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      String a = str.substring(i, i + 3);
      {
        if (a.equals("cat")) {
          countCat++;
        } else if (a.equals("dog")) {
          countDog++;
        }
      }
 }
      if(countCat==countDog){
        System.out.println(true);
      }

      else System.out.println(false);
   
  }
}
