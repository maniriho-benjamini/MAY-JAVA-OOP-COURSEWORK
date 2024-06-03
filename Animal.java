
package oop_coursework.animals;


public class Animal {

    // Fields
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println("Animal sound");
    }

    // Method to eat
    public void eat() {
        System.out.println("Animal is eating");
    }

    // Overloaded method to make sound multiple times
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // Overloaded method to eat a specific food type
    public void eat(String foodType) {
        System.out.println("Animal is eating " + foodType);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Subclass Lion
    public static class Lion extends Animal {
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Roar");
        }

        @Override
        public void eat() {
            System.out.println("Eating meat");
        }
    }

    // Subclass Elephant
    public static class Elephant extends Animal {
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Trumpet");
        }

        @Override
        public void eat() {
            System.out.println("Eating grass");
        }
    }

    // Subclass Monkey
    public static class Monkey extends Animal {
        public Monkey(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Chatter");
        }

        @Override
        public void eat() {
            System.out.println("Eating bananas");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test the Lion class
        Lion lion = new Lion("Leo", 5);
        lion.makeSound();
        lion.eat();

        // Test the Elephant class
        Elephant elephant = new Elephant("Dumbo", 10);
        elephant.makeSound();
        elephant.eat();

        // Test the Monkey class
        Monkey monkey = new Monkey("George", 3);
        monkey.makeSound();
        monkey.eat();
    }


public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Ella", 10);
        Animal monkey = new Monkey("Momo", 3);
        System.out.println("Lion:");
        lion.makeSound();
        lion.eat();
        lion.makeSound(3);
        lion.eat("steak"); 
        System.out.println("\nElephant:");
        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2); 
        elephant.eat("fruits");
        System.out.println("\nMonkey:");
        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4); 
        monkey.eat("nuts"); 
    }
}
}


