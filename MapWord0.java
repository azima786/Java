import java.util.HashMap;
import java.util.Map;

public class MapWord0 {

  public static void main(String[] args) {}

  // Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.

  // wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
  // wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
  // wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}

  public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String s : strings) {
      map.put(s, s.length());
    }
    return map;
  }

  // Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.

  // pairs(["code", "bug"]) → {"b": "g", "c": "e"}
  // pairs(["man", "moon", "main"]) → {"m": "n"}
  // pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

  public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    for (String s : strings) {
      String first = s.substring(0, 1);
      String last = s.substring(s.length() - 1);

      map.put(first, last);
    }
    return map;
  }

  // The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.

  // wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
  // wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
  // wordCount(["c", "c", "c", "c"]) → {"c": 4}

  public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    for (String s : strings) {
      if (!map.containsKey(s)) {
        map.put(s, 1);
      } else {
        int count = map.get(s);
        map.put(s, count + 1);
      }
    }
    return map;
  }

  // Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.

  // firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
  // firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
  // firstChar([]) → {}

  public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
      for (String s : strings) {
      if (!map.containsKey(s)) {
        map.put(s.substring(0,1), s);
      } else {
       String existing = map.get(s.substring(0,1));
      map.put(s.substring(0,1), existing+s);
      }
    }
    return map;
  }
}
