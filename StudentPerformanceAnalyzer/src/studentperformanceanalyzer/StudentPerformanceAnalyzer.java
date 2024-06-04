/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentperformanceanalyzer;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Future CEO
 */
public class StudentPerformanceAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Test Score: ");
            float testScore = scanner.nextFloat();

            students[i] = new Student(id, name, testScore);
        }

        // Sort students by test score
        Arrays.sort(students, (s1, s2) -> Float.compare(s2.getTestScore(), s1.getTestScore()));

        System.out.println("\nSorted list of students:");
        for (Student student : students) {
            student.displayStudentInfo();
        }

        System.out.println("\nTotal number of students: " + Student.getTotalStudents());

        scanner.close();
    }  
    
}
