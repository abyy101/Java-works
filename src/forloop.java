public class forloop {
    public static void main(String[] args) {
        int num = 3;
        String Result;

        for (int i = 1; i < 5; i++) {

            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Result=Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                default:

                    System.out.println("Other");
            }
            System.out.println("count:" + i);
        }

    }
}

