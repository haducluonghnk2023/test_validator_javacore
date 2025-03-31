package util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {

    // Validate kiểu số nguyên
    public static int validateInteger(String message, Scanner sc) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Please try again.");
            }
        }
    }

    // Validate kiểu số thực double
    public static double validateDouble(String message, Scanner sc) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid double. Please try again.");
            }
        }
    }

    // Validate kiểu số thực float
    public static float validateFloat(String message, Scanner sc) {
        while (true) {
            System.out.print(message);
            try {
                return Float.parseFloat(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid float. Please try again.");
            }
        }
    }

    // Validate kiểu Boolean với giá trị nhập vào là true/false
    public static boolean validateBoolean(String message, Scanner sc) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("true")) {
                return true;
            } else if (input.equals("false")) {
                return false;
            } else {
                System.out.println("Invalid boolean. Please enter 'true' or 'false'.");
            }
        }
    }

    // Validate kiểu String, bắt buộc nhập
    // (Không được empty, phải cắt bỏ khoảng trắng 2 đầu), có độ dài từ min đến max
    public static String validateString(String message, Scanner sc, int minLength, int maxLength) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (input.length() >= minLength && input.length() <= maxLength) {
                return input;
            } else {
                System.out.println("Invalid input. Length must be between " + minLength + " and " + maxLength + " characters.");
            }
        }
    }

    // Validate kiểu phone, phải có định dạng số điện thoại di động Việt Nam
    public static String validatePhoneNumber(String message, Scanner sc) {
        String phoneRegex = "^(03|05|07|08|09)\\d{8}$";
        Pattern pattern = Pattern.compile(phoneRegex);

        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (pattern.matcher(input).matches()) {
                return input;
            } else {
                System.out.println("Invalid phone number format. Please try again.");
            }
        }
    }
}