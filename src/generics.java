import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
        Printer<Integer> printer=new Printer<>(50);//define what exactly subclasses should print eg int/string
        printer.print();

        Printer<Double>doublePrinter=new Printer<>(33.5);//reult or number stored is a double
        doublePrinter.print();

        ArrayList<Double>cats=new ArrayList<>();


    }
}
