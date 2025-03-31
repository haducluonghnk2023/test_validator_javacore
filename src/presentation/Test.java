package presentation;

import util.Validator;

import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Validator.validateInteger("nhap 1 so nguyen",sc);
        Validator.validateFloat("nhap 1 so thuc",sc);
        Validator.validateDouble("nhap 1 so thuc",sc);
        Validator.validateBoolean("nhap true/false",sc);
        Validator.validateString("nhap 1 chuoi",sc);
        Validator.validateEmail("nhap email",sc);
        Validator.validatePhoneNumber("nhap phone number",sc);
    }
}
