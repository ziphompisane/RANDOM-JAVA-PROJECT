/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentperformanceanalyzer;
import java.util.Arrays;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private float testScore;
    private boolean passingStatus;
    private static int totalStudents = 0;

    public Student(int id, String name, float testScore) {
        this.id = id;
        this.name = name;
        this.testScore = testScore;
        determinePassingStatus();
        totalStudents++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTestScore() {
        return testScore;
    }

    public void setTestScore(float testScore) {
        this.testScore = testScore;
        determinePassingStatus();
    }

    public boolean isPassingStatus() {
        return passingStatus;
    }

    private void determinePassingStatus() {
        this.passingStatus = testScore >= 50.0;
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Test Score: " + testScore + ", Passing Status: " + (passingStatus ? "Pass" : "Fail"));
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}