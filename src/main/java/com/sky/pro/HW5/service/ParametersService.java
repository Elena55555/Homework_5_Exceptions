
package com.sky.pro.HW5.service;

import com.sky.pro.HW5.exception.WrongLoginException;

import com.sky.pro.HW5.exception.WrongPasswordException;

import org.springframework.stereotype.Service;

@Service

public interface ParametersService {

     String validateParameters(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException;

}

