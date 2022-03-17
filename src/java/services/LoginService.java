/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import service.User;

/**
 *
 * @author Lenovo
 */
public class LoginService {

    public static User login(java.lang.String email, java.lang.String password) {
        service.UserServiceService service = new service.UserServiceService();
        service.UserService port = service.getUserServicePort();
        return port.login(email, password);
    }
    
}
