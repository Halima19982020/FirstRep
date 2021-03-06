
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteReservation", targetNamespace = "http://service/", className = "service.DeleteReservation")
    @ResponseWrapper(localName = "deleteReservationResponse", targetNamespace = "http://service/", className = "service.DeleteReservationResponse")
    @Action(input = "http://service/ReservationService/deleteReservationRequest", output = "http://service/ReservationService/deleteReservationResponse")
    public boolean deleteReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "AjouterReservation")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AjouterReservation", targetNamespace = "http://service/", className = "service.AjouterReservation")
    @ResponseWrapper(localName = "AjouterReservationResponse", targetNamespace = "http://service/", className = "service.AjouterReservationResponse")
    @Action(input = "http://service/ReservationService/AjouterReservationRequest", output = "http://service/ReservationService/AjouterReservationResponse")
    public boolean ajouterReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

    /**
     * 
     * @return
     *     returns java.util.List<service.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "afficherReservation", targetNamespace = "http://service/", className = "service.AfficherReservation")
    @ResponseWrapper(localName = "afficherReservationResponse", targetNamespace = "http://service/", className = "service.AfficherReservationResponse")
    @Action(input = "http://service/ReservationService/afficherReservationRequest", output = "http://service/ReservationService/afficherReservationResponse")
    public List<Reservation> afficherReservation();

}
