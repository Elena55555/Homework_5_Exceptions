package com.sky.pro.HW5.service;
import com.sky.pro.HW5.exception.WrongLoginException;
import com.sky.pro.HW5.exception.WrongPasswordException;
import org.springframework.stereotype.Service;
@Service
public class ParametersServiceClass implements ParametersService {
    public  String validateParameters(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException  {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+{1,20}$")) {
            throw new WrongLoginException("Неверно введен логин");
        }
        else if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+{1,20}$")) {
            throw new WrongPasswordException("Неверно введен пароль");
        }
        else if (!password.equals(confirmPassword)) {
            throw   new   WrongPasswordException(" Пароль не подтвержден");
        } else {
            System.out.println("Игра окончена");
        }
        return "Логин и пароль введены верно: pегистрация прошла успешно ";
    }
}

