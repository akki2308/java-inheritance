class Course {
    // Class attributes
    protected String courseName;
    protected String duration;

    // Constructor
    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + duration);
    }
}

// Subclass
class OnlineCourse extends Course {
    // Class attributes
    protected String platform;
    protected boolean isRecorded;

    // Subclass Constructor
    public OnlineCourse(String courseName, String duration, String platform, Boolean isRecorded) {
        // Calling base class constructor
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Method to display online course details
    @Override
    public void displayCourseDetails() {
        // Overriding base class method
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass
class PaidOnlineCourse extends OnlineCourse {
    // Class attributes
    private double fee;
    private double discount;

    // Subclass Constructor
    public PaidOnlineCourse(String courseName, String duration, String platform, Boolean isRecorded, double fee, double discount) {
        // Calling superclass constructor
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate discount
    public double calculateDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    // Method to display paid online course details
    @Override
    public void displayCourseDetails() {
        // Overriding superclass method
        super.displayCourseDetails();
        System.out.println("Course Fee: Rs " + fee);
        System.out.println("Discount (in %): " + discount);
        System.out.println("Discounted Course Fee: " + calculateDiscountedFee());
    }
}
public class EducationalCourseSystem {
    public static void main(String[] args) {
        System.out.println("Course Details:");
        Course course = new Course("Data Structures and Algorithms", "3 months");
        course.displayCourseDetails();

        System.out.println("\nCourse and Platform Details:");
        OnlineCourse onlineCourse = new OnlineCourse("Data Structures and Algorithms", "3 months", "Udemy", true);
        onlineCourse.displayCourseDetails();

        System.out.println("\nCourse, Platform, and Fee Details:");
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Structures and Algorithms", "3 months", "Udemy", true, 5000.0, 25.0);
        paidOnlineCourse.displayCourseDetails();
    }
}

