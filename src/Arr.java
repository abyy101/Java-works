public class Arr {
    public static void main(String[] args) {
        String[] namess = new String[]{"Bed", "Kitchen", "Razor", "Hotel"};

        for (String item : namess) {
            if (item.startsWith("B")) {
                System.out.println(item);
            }
        }

        // Clear the array
        namess = new String[1];
    }
}