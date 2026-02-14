package lab3;

// Mobile.java
class Mobile {
    String brand;
    String model;
    double price;

    // No-argument constructor
    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone information
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        // Using no-argument constructor
        Mobile phone1 = new Mobile();
        System.out.println("Phone 1 Details:");
        phone1.displayInfo();

        // Using parameterized constructor
        Mobile phone2 = new Mobile("Samsung", "Galaxy S23", 999.99);
        System.out.println("Phone 2 Details:");
        phone2.displayInfo();
    }
}
