import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> friendsList= new ArrayList<>(Arrays.asList("Janice","Nana", "Albert"));
        System.out.println(friendsList);

        ArrayList<Integer> employees=new ArrayList<>(Arrays.asList(1029,36798,6372));
        System.out.println(employees.get(0));

        System.out.println(employees.remove(2));

        employees.set(1,3300);//place index and then word to set
        System.out.println(employees);

        employees.add(6372);
        System.out.println(employees);



    }
}
