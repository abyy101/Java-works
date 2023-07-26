public class Temperature {
    public static void main(String[] args) {
        int fahrenheit = 60;
        double temperature = ((fahrenheit - 32) * 5.0 / 9.0);
        System.out.println(Math.round(temperature) + " degree Celsius");
    }
}
