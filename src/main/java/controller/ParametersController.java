
package controller;


import service.ParametersService;

import exception.WrongLoginException;

import exception.WrongPasswordException;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;


@RestController


public class ParametersController {


    private final ParametersService parametersService;

    public ParametersController(ParametersService parametersService) {
        this.parametersService = parametersService;
    }

    String login = "123456789a_";

    String password = "987654321b_";

    String confirmPassword = "987654321b_";

    @GetMapping(path = "/service")


    public String validateParametersInfo(@RequestParam("login") String login,

                                         @RequestParam("password") String password,

                                         @RequestParam("confirmPassword") String confirmPassword) throws WrongPasswordException, WrongLoginException {


        try{

            parametersService.validateParameters(login,  password, confirmPassword);


        } catch (WrongLoginException e){

            return "Неверно введен логин";


        } catch (WrongPasswordException e) {

            return "Неверно введен пароль либо пароль  не подтвержден";


        } finally {

            System.out.println("Игра окончена");


        }

        return  " " ;

    }

}

//        try {
//
//            parametersService.validateParameters(login, password, confirmPassword);
//
//
//        } catch (WrongLoginException e) {
//
//            return String.valueOf(new WrongLoginException("Неверно введен логин"));
//
//
//        } catch (WrongPasswordException e) {
//
//            return String.valueOf(new WrongLoginException("Неверно введен пароль либо пароль  не подтвержден"));
//
//
//
//
//        } finally {
//
//             System.out.println("Игра окончена");
//
//
//       }
//        return " ";

















