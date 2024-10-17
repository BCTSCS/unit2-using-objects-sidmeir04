import greenfoot.GreenfootSound;

public class Person {
    // Private instance variables (attributes)
    private int x;
    private int y;
    private int speed;
    private String name;
    private boolean canTalk;
    private GreenfootSound sound;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.speed = 0;
        this.canTalk = false;
        this.sound = null;
    }

    // Constructor with one parameter
    public Person(String namePerson) {
        this.name = namePerson;
        this.speed = 0;
        this.canTalk = false;
        this.sound = null;
    }

    // Constructor with two parameters
    public Person(String namePerson, int sp) {
        this.name = namePerson;
        this.speed = sp;
        this.canTalk = false;
        this.sound = null;
    }

    // Method to simulate walking
    public void walk() {
        System.out.println(name + " is walking with speed " + speed);
    }

    // Overriding the toString() method to return a string representation of the object
    @Override
    public String toString() {
        return "Person{name='" + name + "', speed=" + speed + ", canTalk=" + canTalk + "}";
    }
    
        public static void main(String[] args) {
        // Creating a Person using the default constructor
        Person person1 = new Person();
        System.out.println(person1);  // This will call the toString() method

        // Creating a Person using the constructor with one parameter (namePerson)
        Person person2 = new Person("Ben");
        System.out.println(person2);  // This will call the toString() method

        // Creating a Person using the constructor with two parameters (namePerson, sp)
        Person person3 = new Person("Reese", 5);
        System.out.println(person3);  // This will call the toString() method
    }
}
