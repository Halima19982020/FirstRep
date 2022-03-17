/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author Lenovo
 */
public class VisualServer {

    public static boolean ajouter(org.tempuri.User user) {
        org.tempuri.Service service = new org.tempuri.Service();
        org.tempuri.ServiceSoap port = service.getServiceSoap();
        return port.ajouter(user);
    }

    
}
