public class newone {//pascal naming convection where every start letter is uppercase
    public static void main(String[] args) {//a main method. //naming is camel naming convection where each starting letter is a capital letter except for the first word.
        Person person=new Person();
        person.name="Aby";
        person.age=20;
        person.birthday();
    }
    static class Person{
        String name;
        int age;
        void birthday(){
            age++;
            System.out.println(name+age);
        }
    }
}
