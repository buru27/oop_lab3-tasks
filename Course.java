package lab3;

// Course.java
class Course {
    String courseCode;
    String courseName;
    int creditHours;

    // Parameterized constructor
    Course(String code, String name, int hours) {
        courseCode = code;
        courseName = name;
        creditHours = hours;
    }

    // Method to display course details
    void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("CS101", "oop", 3);
        Course course2 = new Course("MT2", "dld", 4);

        // Displaying course details
        course1.displayCourse();
        course2.displayCourse();
    }
}
