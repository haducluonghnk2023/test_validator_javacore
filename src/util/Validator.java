package util;

import java.util.Scanner;

public class Validator {
    // Validate kiểu số nguyên
    public static int validateInteger(String message, Scanner sc) {
        System.out.println(message);
        try {
           return Integer.parseInt(sc.nextLine());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    // Validate kiểu số thực double
    public static double validateDouble(String message, Scanner sc) {
        System.out.println(message);
        try {
            return Double.parseDouble(sc.nextLine());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Double.parseDouble(sc.nextLine());
    }
    // Validate kiểu sốthực float
    public static float validateFloat(String message, Scanner sc) {
        System.out.println(message);
        try {
            return Float.parseFloat(sc.nextLine());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    // Validate kiểu Booleanvới giá trịnhập vào là true/false
    public static boolean validateBoolean(String message, Scanner sc) {
        System.out.println(message);
        try {
            return sc.nextLine().equals("true");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    // Validate kiếu String, bắt buộc nhập
    // (Không được empty, phải cắt bỏkhoảng trắng 2 đầu), có độdài từmin đến max
    public static String validateString(String message, Scanner sc) {
        System.out.println(message);
        try {
            return sc.nextLine();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    // Validate kiểuemail, phải có định dạng email
    public static boolean validateEmail(String message, Scanner sc) {
        System.out.println(message);
        try {
            return sc.nextLine().trim().matches("@gmai.com");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
    // Validate kiểu phone, phải có định dạng sốđiệnthoại di động Việt Nam
    public static boolean validatePhoneNumber(String message, Scanner sc) {
        System.out.println(message);
        try {
            return sc.nextLine().trim().matches("^[03|05|07|09]\\d{8}");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}
