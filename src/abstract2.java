public class abstract2 {
    public static void main(String[] args) {
        Animall cow = new Cow();
        cow.sound();
    }

}
abstract class Animall{
    abstract void sound();
}
class Cow extends Animall{
    public void sound(){
        System.out.println("Moos");
    }
}

