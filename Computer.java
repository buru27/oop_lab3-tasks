package lab3;

// Computer.java
class Computer {
    String systemID;
    String processor;
    int ram; // in GB
    String operatingSystem;

    // Parameterized constructor
    Computer(String id, String proc, int ramSize, String os) {
        systemID = id;
        processor = proc;
        ram = ramSize;
        operatingSystem = os;
    }

    // Method to display computer details
    void displayDetails() {
        System.out.println("System ID: " + systemID);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating computer objects
        Computer comp1 = new Computer("C101", "Intel i5", 8, "Windows 10");
        Computer comp2 = new Computer("C102", "AMD Ryzen 7", 16, "Ubuntu 22.04");

        // Displaying computer details
        comp1.displayDetails();
        comp2.displayDetails();
    }
}
