import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();   
                case 5 -> updateStudent();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    static void showMenu() {
        System.out.println("\n--- Student Management System ---");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Update Student");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        for (Student s : students) {
        if (s.id == id) {
        System.out.println("ID already exists. Student not added.");
        return;
        students.add(new Student(id, name, age));
        System.out.println("Student added successfully.");
        
    }
}

    }

    static void viewStudents() {
        if (stufor
                    ts.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println("ID: " + s.id + ", Name: " + s.name + ", Age: " + s.age);
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = scanner.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found: " + s.name + ", Age: " + s.age);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();

        students.removeIf(s -> s.id == id);
        System.out.println("Delete operation completed.");
    }
    static void updateStudent() {
    System.out.print("Enter ID to update: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // consume newline

    for (Student s : students) {
        if (s.id == id) {
            System.out.print("Enter new name: ");
            s.name = scanner.nextLine();
            System.out.print("Enter new age: ");
            s.age = scanner.nextInt();
            System.out.println("Student updated successfully.");
            return;
        }
    }
    System.out.println("Student not found.");
}

}
