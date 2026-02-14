package lab3;

// Programmer.java
class Programmer {
    int id;
    String name;
    String language;
    int problemsSolved;

    // Parameterized constructor
    Programmer(int id, String name, String lang, int solved) {
        this.id = id;
        this.name = name;
        this.language = lang;
        this.problemsSolved = solved;
    }

    // Method to update number of problems solved
    void updateProblemsSolved(int newProblems) {
        problemsSolved += newProblems;
    }

    // Method to display programmer details
    void displayProgrammer() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Problems Solved: " + problemsSolved);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating programmer objects
        Programmer prog1 = new Programmer(101, "Alice", "Java", 25);
        Programmer prog2 = new Programmer(102, "Bob", "Python", 40);

        // Display initial details
        System.out.println("Initial Programmer Details:");
        prog1.displayProgrammer();
        prog2.displayProgrammer();

        // Update solved problems
        prog1.updateProblemsSolved(5); // Alice solved 5 more
        prog2.updateProblemsSolved(10); // Bob solved 10 more

        // Display updated details
        System.out.println("Updated Programmer Details:");
        prog1.displayProgrammer();
        prog2.displayProgrammer();
    }
}

