class Animal {
    String name;
    String breed;

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

// Dog inherits Animal
class Dog extends Animal {

}

// Lion should also inherit Animal if it is an animal
class Lion extends Animal {
    public void killAnimals() {
        System.out.println(name + " is killing animals");
    }
}

public class inheritence {
    public static void main(String[] args) {

        Dog gs = new Dog();
        gs.name = "German Shepherd";
        gs.walk();
        gs.eat();

        Lion leo = new Lion();
        leo.name = "Lion King";
        leo.walk();
        leo.killAnimals();
    }
}
