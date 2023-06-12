import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        names.add("Aby");
        names.add("Sol");
        names.add("Tyler");
        names.add("Jess");
        System.out.println(names);
        System.out.println(names.contains("Sol"));
        names.forEach(System.out::println);
    }
}
