import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>empIds=new HashMap<>();
        empIds.put("Mary", 1234);
        empIds.put("Kenny", 2234);
        empIds.put("John", 3234);
        System.out.println(empIds);
        System.out.println(empIds.get("Kenny"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(11223));
        empIds.put("Mary",778);
        System.out.println(empIds);
        empIds.replace("Kenny",2255);
        System.out.println(empIds);
        empIds.putIfAbsent("Yursa",6654);
        System.out.println(empIds);
        empIds.remove("John");
        System.out.println(empIds);

    }
}
