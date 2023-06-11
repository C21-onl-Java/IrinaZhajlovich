package ru.teachmeskills.homework11.task2;

public class User {
    public static boolean confirmUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() < 20 && !login.contains(" ")) {
            if (password.length() < 20 && !password.contains(" ") && password.equals(confirmPassword)) {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) return true;
                }
                throw new WrongPasswordException("В пароле отсутствют цифры");
            }
            if (password.length() > 20) throw new WrongPasswordException("Длина пароля больше 20");
            if (password.contains(" ")) throw new WrongPasswordException("Пароль содержит пробелы");
            if (!password.equals(confirmPassword)) throw new WrongPasswordException("Пароли не равны");
            throw new WrongPasswordException();
        }
        if (login.length() > 20) throw new WrongLoginException("Длина логина больше 20");
        if (login.contains(" ")) throw new WrongLoginException("Логин содержит пробелы");
        throw new WrongLoginException();

    }
}

