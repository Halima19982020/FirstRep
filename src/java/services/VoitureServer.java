/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import service.Voiture;

/**
 *
 * @author Lenovo
 */
public class VoitureServer {

    public static boolean ajouterV(service.Voiture arg0) {
        service.VoitureService_Service service = new service.VoitureService_Service();
        service.VoitureService port = service.getVoitureServicePort();
        return port.ajouterV(arg0);
    }

    public static Voiture ajouterVoiture(int arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8) {
        service.VoitureService_Service service = new service.VoitureService_Service();
        service.VoitureService port = service.getVoitureServicePort();
        return port.ajouterVoiture(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    public static java.util.List<service.Voiture> afficher() {
        service.VoitureService_Service service = new service.VoitureService_Service();
        service.VoitureService port = service.getVoitureServicePort();
        return port.afficher();
    }

    public static boolean delete(int arg0) {
        service.VoitureService_Service service = new service.VoitureService_Service();
        service.VoitureService port = service.getVoitureServicePort();
        return port.delete(arg0);
    }

    public static Voiture getSingledem(int arg0) {
        service.VoitureService_Service service = new service.VoitureService_Service();
        service.VoitureService port = service.getVoitureServicePort();
        return port.getSingledem(arg0);
    }

    public static boolean modifier(service.Voiture v) {
        service.VoitureService_Service service = new service.VoitureService_Service();
        service.VoitureService port = service.getVoitureServicePort();
        return port.modifier(v);
    }

   

    
    
    }

   

    
    

