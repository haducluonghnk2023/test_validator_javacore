package presentation;

import util.Validator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Validator.validateInteger("Enter your age: ", sc);
        double salary = Validator.validateDouble("Enter your salary: ", sc);
        float tax = Validator.validateFloat("Enter your tax: ", sc);
        boolean isStudent = Validator.validateBoolean("Are you a student (true/false): ", sc);
        String name = Validator.validateString("Enter your name: ", sc, 3, 50);
        String phoneNumber = Validator.validatePhoneNumber("Enter your phone number: ", sc);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
