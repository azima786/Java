import java.util.HashMap;

public class mapAB {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "aaa");

        // if(map.containsKey("a")&& map.containsKey("b")){
        //  map.put("ab", map.get("a") + map.get("b"));
        // }

//         if(map.containsKey("ice cream")){
//             map.put("ice cream", "cherry");
//             map.put("bread", "butter");
            
//         }
// else   map.put("bread", "butter");
//         System.out.println(map);
//     }

//  if(map.containsKey("a")&& map.containsKey("b")){
//    if(map.get("a").equalsIgnoreCase(map.get("b"))){
//     map.remove("a");
//     map.remove("b");
//    }   

 if(map.containsKey("a")&& map.containsKey("b")){
  System.out.println(map);
 }
else if(map.containsKey("a") || map.containsKey("b")){
   if(map.containsKey("a")){
    map.put("b", map.get("a"));
   }

   else {
     map.put("a", map.get("b"));
   }
   }  
}}
