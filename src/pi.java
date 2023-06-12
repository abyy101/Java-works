import java.text.NumberFormat;

//changing strings to an integer
//creating instances using factories.
public class pi {
    public static void main(String[] args) {
        NumberFormat currency= NumberFormat.getCurrencyInstance();
        String result=currency.format(1234567.891);
        System.out.println(result);
    }
}
