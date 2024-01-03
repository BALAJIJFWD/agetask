public class twotwo {

    private String name;
    private int age;

    // Default constructor with default age set to 18
    public twotwo() {
        this.age = 18;
    }

    // Parameterized constructor to initialize name and age
    public twotwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of the person
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a person object using default constructor
        twotwo defaultPerson = new twotwo();
        System.out.println("Default Person Details:");
        defaultPerson.displayPersonDetails();
        System.out.println();

        // Creating a person object with name and age using parameterized constructor
        twotwo customPerson = new twotwo("John Doe", 25);
        System.out.println("Custom Person Details:");
        customPerson.displayPersonDetails();
    }
}
