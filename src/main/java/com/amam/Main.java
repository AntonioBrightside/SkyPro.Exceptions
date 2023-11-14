package com.amam;

import java.util.regex.Pattern;

public class Main {

    public static void logIn(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20 | !Pattern.matches("\\w+", login)) {
            throw new WrongLoginException("Количество символов в логике превышает допустимый объем или добавлен недопустимый символ");
        }

        if (password.length() > 20 | !Pattern.matches("\\w+", password)) {
            throw new WrongPasswordException("Количество символов в пароле превышает допустимый объем или добавлен недопустимый символ");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    public static void main(String[] args) {
        try {
            logIn("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}