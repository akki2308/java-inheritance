class Person {
    // Class attributes
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Teacher extends Person {
    // Class attributes
    private String subject;

    // Subclass Constructor
    public Teacher(String name, int age, String subject) {
        // Calling superclass constructor
        super(name, age);
        this.subject = subject;
    }

    // Method to display teacher details
    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }

}

// Subclass
class Student extends Person {
    // Class attributes
    private String grade;

    // Subclass Constructor
    public Student(String name, int age, String grade) {
        // Calling superclass constructor
        super(name, age);
        this.grade = grade;
    }

    // Method to display student details
    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }

}

// Subclass
class Staff extends Person {
    // Class attributes
    private String domain;

    // Subclass Constructor
    public Staff(String name, int age, String domain) {
        // Calling superclass constructor
        super(name, age);
        this.domain = domain;
    }

    // Method to display staff details
    public void displayRole() {
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Domain: " + domain);
    }

}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Akshit", 21, "Data Structures");
        teacher.displayRole();

        System.out.println();

        Student student = new Student("Harsh", 22, "A");
        student.displayRole();

        System.out.println();

        Staff staff = new Staff("Harshit", 25, "Research");
        staff.displayRole();
    }
}

