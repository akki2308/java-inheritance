class Animal {
    String name;
    int age;

    void makeSound(){
        System.out.println("Animal makes a sound");
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name + " Age:" + age);
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); //Child class can call the constructor of the parent class using super()
    }

    @Override //Method Overriding is used when a subclass provides a specific implementation of a method that is already defined in its superclass
    void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println("Cat Meowww");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Bird Chirps");
    }
}

public class AnimalHierarchy2 {
    public static void main(String[] args) {

        Animal animal = new Animal("buzo", 4);

        Animal dog = new Dog("tiger", 5);
        Dog dog2 = new Dog("bhao bhao", 7);

        Animal cat = new Cat("billi", 3);

        Animal bird = new Bird("chidiya", 1);

        animal.displayDetails();
        animal.makeSound();

        dog.displayDetails();
        dog.makeSound();

        dog2.displayDetails();
        dog2.makeSound();

        cat.displayDetails();
        cat.makeSound();

        bird.displayDetails();
        bird.makeSound();
    }
}