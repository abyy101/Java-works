public class polymorphism {
    public static void main(String[] args) {
        Pupil pupil1=new Pupil();
        pupil1.name();
        pupil1.id();
        Mypupill mypupil=new Mypupill();
        mypupil.name();
        mypupil.id();
    }
}
class Pupil{
    public void name(){
        System.out.println("Abigael Wambui");
    }
    public void id(){
        System.out.println("663529");
    }
}
class Mypupill extends Pupil{
    public void name(){
        System.out.println("Esther Wambui");
    }
    public void id() {
        System.out.println("554739");
            }
}
