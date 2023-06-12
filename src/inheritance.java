public class inheritance {
    public static void main(String[] args) {//main method
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
        Cat cat=new Cat();
        cat.eat();
        cat.sleep();

    }
}
class Animal{//super class
    void eat(){
        System.out.println("The animal is eating");
    }
}
class Dog extends Animal{//subclass
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("The cat is sleeping");
    }
}
