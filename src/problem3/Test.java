package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity (n) of the library: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Library library = new Library(n);

        // Initialize the library with two initial documents
        Document doc1 = new Novel("To Kill a Mockingbird", "Harper Lee", 281, 15.99);
        Document doc2 = new Magazine("National Geographic", "May", 2023);

        library.add(doc1);
        library.add(doc2);

        int choice;
        do {
            System.out.println("\n===== LIBRARY MANAGEMENT MENU =====");
            System.out.println("1. Display Documents");
            System.out.println("2. Add Document");
            System.out.println("3. Delete Document by Record Number");
            System.out.println("4. Find Document by Record Number");
            System.out.println("5. Display Authors");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayDocuments();
                    break;
                case 2:
                    System.out.println("\nSelect Document Type:");
                    System.out.println("1. Novel");
                    System.out.println("2. Textbook");
                    System.out.println("3. Magazine");
                    System.out.println("4. Dictionary");
                    System.out.print("Enter type choice: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    Document newDoc = null;
                    if (type == 1 || type == 2) {
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter number of pages: ");
                        int nbrPages = scanner.nextInt();
                        scanner.nextLine();

                        if (type == 1) {
                            System.out.print("Enter price: ");
                            double price = scanner.nextDouble();
                            scanner.nextLine();
                            newDoc = new Novel(title, author, nbrPages, price);
                        } else {
                            System.out.print("Enter level: ");
                            String level = scanner.nextLine();
                            newDoc = new Textbook(title, author, nbrPages, level);
                        }
                    } else if (type == 3) {
                        System.out.print("Enter month: ");
                        String month = scanner.nextLine();
                        System.out.print("Enter year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();
                        newDoc = new Magazine(title, month, year);
                    } else if (type == 4) {
                        System.out.print("Enter language: ");
                        String language = scanner.nextLine();
                        newDoc = new Dictionary(title, language);
                    }

                    if (newDoc != null) {
                        boolean added = library.add(newDoc);
                        if (added) {
                            System.out.println("Document added successfully!");
                        } else {
                            System.out.println("Failed to add document (Library is full).");
                        }
                    } else {
                        System.out.println("Invalid document type selected.");
                    }
                    break;

                case 3:
                    System.out.print("Enter record number to delete: ");
                    int delNum = scanner.nextInt();
                    scanner.nextLine();
                    Document docToDelete = library.document(delNum);
                    if (docToDelete != null) {
                        boolean deleted = library.delete(docToDelete);
                        if (deleted) {
                            System.out.println("Document deleted successfully.");
                        } else {
                            System.out.println("Failed to delete document.");
                        }
                    } else {
                        System.out.println("Document with record number " + delNum + " not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter record number to search: ");
                    int searchNum = scanner.nextInt();
                    scanner.nextLine();
                    Document foundDoc = library.document(searchNum);
                    if (foundDoc != null) {
                        System.out.println("Found: " + foundDoc);
                    } else {
                        System.out.println("Document not found.");
                    }
                    break;

                case 5:
                    library.displayAuthors();
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}