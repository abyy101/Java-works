public class arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = a + b;
        int difference = a - b;
        int x = 10;
        int y = 12;
        int count=0;

        boolean bool = false;
        System.out.println("Boolean value:" + bool);

        int val = (bool) ? 10 : 12;//convert boolean to integer
        System.out.println("Integer value:" + val);
        while (count <= 5) {


            if (x > 5) {
                System.out.println("The number is greater");
            } else {
                System.out.println("The number is lower");
            }
            System.out.println("The sum is" + sum);
            System.out.println("The difference is" + difference);
            System.out.println("Count:"+count);
            count++;
        }
    }
}
