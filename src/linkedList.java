import java.util.LinkedList;
//in linked lists, adding is quicker and effiecient than in an arraylist since only references of the previous and after addresses are changed.
public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> nameslinkedlist=new LinkedList<>();
        nameslinkedlist.add("John");
        nameslinkedlist.add("Vivian");
        nameslinkedlist.add("Peter");
        System.out.println(nameslinkedlist.get(0));
        System.out.println(nameslinkedlist.remove(1));
        System.out.println(nameslinkedlist);

    }
}
