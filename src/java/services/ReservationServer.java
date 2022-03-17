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
public class ReservationServer {

    public static boolean ajouter(service.Reservation arg0) {
        service.ReservationService_Service service = new service.ReservationService_Service();
        service.ReservationService port = service.getReservationServicePort();
        return port.ajouterReservation(arg0);
    }

    public static java.util.List<service.Reservation> afficher() {
        service.ReservationService_Service service = new service.ReservationService_Service();
        service.ReservationService port = service.getReservationServicePort();
        return port.afficherReservation();
    }

    public static boolean delete(int arg0) {
        service.ReservationService_Service service = new service.ReservationService_Service();
        service.ReservationService port = service.getReservationServicePort();
        return port.deleteReservation(arg0);
    }
    
}
