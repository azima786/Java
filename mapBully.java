import java.util.HashMap;


public class mapBully {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<String, String>();
       // map.put("a", "");
        map.put("b", "Hello");

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
            map.remove("c");
        } 

       
    System.out.println(map);
    }

}
    
