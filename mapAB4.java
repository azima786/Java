import java.util.HashMap;

public class mapAB4 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("a", "aaa");
    map.put("b", "aaa");

if(map.containsKey("a") && map.containsKey("b")){
    String a = map.get("a");
    String b = map. get("b");

    if(a.length() > b.length()){
        map.put("c", a);
    }
   else if (b.length() > a.length()){
        map.put("c", b);
    }

    else {
         map.put("a", "");
          map.put("b", "");
    }

} System.out.println(map);
  }}

