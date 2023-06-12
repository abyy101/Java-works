import java.util.Random;

public class Ass2 {
    public static void main(String[] args) {
        Generate generate= new Pin();
        generate.getpin();
    }
}
abstract class Generate {
    public void getpin() {

    }
}
class Pin extends Generate{//inheritance
    public void getpin(){
        int random =new Random().nextInt(10_000);//generating 4digit random numbers and placed to variable random.
        System.out.println(random);//print out the random number
    }
}

