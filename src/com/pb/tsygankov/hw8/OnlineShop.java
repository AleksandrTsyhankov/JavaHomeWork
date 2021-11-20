package com.pb.tsygankov.hw8;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String userLogin;
        String userPassword;
        String submitPassword;

        Scanner in = new Scanner(System.in);

        Auth auth = new Auth();

        System.out.println("Введите логин и пароль для регистрации");

                try {
                    System.out.println("Введите логин");
                    userLogin = in.nextLine();
                    auth.setLogin(userLogin);

                    System.out.println("Введите пароль");
                    userPassword = in.nextLine();
                    auth.setPassword(userPassword);

                    System.out.println(("Подтвердите пароль"));
                    submitPassword = in.nextLine();

                    auth.signUp(userLogin, userPassword, submitPassword);

                } catch (WrongLoginException e) {
                    System.out.println("Ошибка при вводе логина: " + e.getMessage());
                    System.exit(1);
                } catch (WrongPasswordException e) {
                    System.out.println("Ошибка при вводе пароля: " + e.getMessage());
                    System.exit(1);
                }

                System.out.println("\n");

        System.out.println("Войдите в аккаунт");

        try {
            System.out.println("Введите логин");
            userLogin = in.nextLine();


            System.out.println("Введите пароль");
            userPassword = in.nextLine();


            auth.signIn(userLogin, userPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка входа в аккаунт: " + e.getMessage());
            System.exit(1);
        }
    }
}
