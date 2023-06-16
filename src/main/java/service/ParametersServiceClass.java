package service;
import exception.WrongLoginException;
import exception.WrongPasswordException;
import org.springframework.stereotype.Service;
@Service
public class ParametersServiceClass implements ParametersService {


    public  void validateParameters(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException  {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_] {1,20}$")) {
            throw new WrongLoginException("Неверно введен логин");
        }

        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_] {1,20}$")) {


            throw new WrongPasswordException("Неверно введен пароль");
        }

        if (!password.equals(confirmPassword)) {
            throw new   WrongPasswordException(" Пароль  не подтвержден");

        }

    }
}

