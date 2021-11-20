package com.pb.tsygankov.hw8;

public class Auth {
    String login;
    String password;
    String submitPassword;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signUp (String login, String password, String submitPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() < 5 || login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть от 5 до 20 символов");
        } else if (login.matches("[^0-9a-zA-Z]+")) {
            throw new WrongLoginException("Логин должен содержать только латинские буквы и цифры");
        }

        if(password.length() <= 5) {
            throw new WrongPasswordException("Длина пароля должна быть более 5 символов");
        } else if(password.matches("[^0-9a-zA-Z_]+")) {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания");
        }

        if(!password.matches(submitPassword)) {
            throw new WrongPasswordException("Введен неверный пароль");
        }
    }

    public void signIn (String login, String password) throws WrongLoginException {
        if(!login.matches(this.login) || !password.matches(this.password)) {
            throw new WrongLoginException("Введены неправильные логин или пароль");
        } else {
            System.out.println("Вы вошли в аккаунт");
        }
    }
}
